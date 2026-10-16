// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListKeysRequest} extends {@link RequestModel}
 *
 * <p>ListKeysRequest</p>
 */
public class ListKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListKeysRequest(Builder builder) {
        super(builder);
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListKeysRequest, Builder> {
        private String filters; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListKeysRequest request) {
            super(request);
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>A filter for master keys. The filter consists of 0 to 10 key-value pairs.</p>
         * <ul>
         * <li><p>Key</p>
         * <ul>
         * <li><p>Description: The property to filter.</p>
         * </li>
         * <li><p>Type: String.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Values</p>
         * <ul>
         * <li><p>Description: The value to be included after filtering.</p>
         * </li>
         * <li><p>Type: String array.</p>
         * </li>
         * <li><p>Length: 0 to 10.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If \<code>Key\\</code> is set to \<code>KeyState\\</code>, it specifies the key status. Valid values for \<code>Value\\</code> are \<code>Enabled\\</code>, \<code>Disabled\\</code>, \<code>PendingDeletion\\</code>, and \<code>PendingImport\\</code>.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>KeySpec\\</code>, it specifies the key type. Valid values for \<code>Value\\</code> are \<code>Aliyun_AES_256\\</code>, \<code>Aliyun_SM4\\</code>, \<code>RSA_2048\\</code>, \<code>EC_P256\\</code>, \<code>EC_P256K\\</code>, \<code>EC_SM2\\</code>, and \<code>Aliyun_SM4\\</code>.<br> Note: You can create keys of the \<code>EC_SM2\\</code> and \<code>Aliyun_SM4\\</code> types only in regions that support managed HSMs and have passed the compliance assessment of the Office of State Commercial Cryptography Administration (OSCCA). For more information about the supported regions, see <a href="https://help.aliyun.com/document_detail/125803.html">Supported regions</a>. If you specify \<code>EC_SM2\\</code> or \<code>Aliyun_SM4\\</code> in a region that does not support these key types, the parameters are ignored.<br></p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>KeyUsage\\</code>, it specifies the key usage. Valid values for \<code>Value\\</code> are \<code>ENCRYPT/DECRYPT\\</code> (for data encryption and decryption) and \<code>SIGN/VERIFY\\</code> (for generating and verifying digital signatures).</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>ProtectionLevel\\</code>, it specifies the protection level of the key. Valid values for \<code>Value\\</code> are \<code>SOFTWARE\\</code> and \<code>HSM\\</code>.<br> Note: The HSM protection level is supported only in specific regions. For more information about the supported regions, see <a href="https://help.aliyun.com/document_detail/125803.html">Supported regions</a>. If you specify \<code>HSM\\</code> in a region that does not support it, the parameter is ignored.<br></p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>CreatorType\\</code>, it specifies the creator type. Valid values for \<code>Value\\</code> are \<code>User\\</code> (returns master keys created by users) and \<code>Service\\</code> (returns master keys that are automatically created by other Alibaba Cloud services based on your authorization).</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>DKMSInstanceId\\</code>, it specifies the ID of the KMS instance. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>keyId\\</code>, it specifies the key ID. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>AliasName\\</code>, it specifies the key alias. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>Creator\\</code>, it specifies the key creator. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>TagKey\\</code>, it specifies the key of a key tag. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * <li><p>If \<code>Key\\</code> is set to \<code>TagValue\\</code>, it specifies the value of a key tag. Set \<code>Value\\</code> as needed.</p>
         * </li>
         * </ul>
         * <p>The logical relationship between different keys in \<code>Filters\\</code> is \<code>AND\\</code>. The logical relationship between multiple values for the same key is \<code>OR\\</code>. For example, if you enter <code>[ {&quot;Key&quot;:&quot;KeyState&quot;, &quot;Values&quot;:[&quot;Enabled&quot;,&quot;Disabled&quot;]}, {&quot;Key&quot;:&quot;KeyState&quot;, &quot;Values&quot;:[&quot;PendingDeletion&quot;]}, {&quot;Key&quot;:&quot;KeySpec&quot;, &quot;Values&quot;:[&quot;Aliyun_AES_256&quot;]} ]</code>, the semantics are: <code>(KeyState=Enabled OR KeyState=Disabled OR KeyState=PendingDeletion) AND (KeySpec=Aliyun_AES_256)</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;:&quot;KeyState&quot;, &quot;Values&quot;:[&quot;Enabled&quot;,&quot;Disabled&quot;]}]</p>
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The page number.<br> Valid values: greater than 0.<br> Default value: 1.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.<br> Valid values: 1 to 100.<br> Default value: 10.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListKeysRequest build() {
            return new ListKeysRequest(this);
        } 

    } 

}
