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
         * <p>The CMK filter. The filter consists of one or more key-value pairs. You can specify a maximum of 10 key-value pairs.</p>
         * <ul>
         * <li><p>Key</p>
         * <ul>
         * <li><p>Description: the property that you want to filter.</p>
         * </li>
         * <li><p>Type: string.</p>
         * </li>
         * <li><p>Valid values:</p>
         * <ul>
         * <li>KeyState: the status of the CMK.</li>
         * <li>KeySpec: the type of the CMK.</li>
         * <li>KeyUsage: the usage of the CMK.</li>
         * <li>ProtectionLevel: the protection level.</li>
         * <li>CreatorType: the type of the creator.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Values</p>
         * <ul>
         * <li><p>Description: the value to be included after filtering.</p>
         * </li>
         * <li><p>Format: string array.</p>
         * </li>
         * <li><p>Length: 0 to 10.</p>
         * </li>
         * <li><p>Valid values:</p>
         * <ul>
         * <li><p>When Key is set to KeyState, the value can be Enabled, Disabled, PendingDeletion, or PendingImport.</p>
         * </li>
         * <li><p>When Key is set to KeySpec, the value can be Aliyun_AES_256, Aliyun_SM4, RSA_2048, EC_P256, EC_P256K, or EC_SM2.</p>
         * <p>Note: You can create CMKs of the EC_SM2 or Aliyun_SM4 type only in regions where State Cryptography Administration (SCA)-certified managed HSMs reside. For more information about the regions, see <a href="https://help.aliyun.com/document_detail/125803.html">Supported regions</a>. If your region does not support EC_SM2 or Aliyun_SM4, the two values are ignored if they are specified.</p>
         * </li>
         * <li><p>When Key is set to KeyUsage, the value can be ENCRYPT/DECRYPT or SIGN/VERIFY. ENCRYPT/DECRYPT indicates that the CMK is used to encrypt and decrypt data. SIGN/VERIFY indicates that the CMK is used to generate and verify digital signatures.</p>
         * </li>
         * <li><p>When Key is set to ProtectionLevel, the value can be SOFTWARE (software) or HSM (hardware).</p>
         * <p>You can set ProtectionLevel to HSM in only specific regions. For more information about the regions, see <a href="https://help.aliyun.com/document_detail/125803.html">Supported regions</a>. If your region does not support the value HSM, the value is ignored if the value is specified.</p>
         * </li>
         * <li><p>If Key is set to CreatorType, the value can be User or Service. User indicates that CMKs created by the current account are queried. Service indicates that CMKs automatically created by other cloud services authorized by the current account are queried.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>The logical relationship between different keys is AND, and the logical relationship between multiple items in the same key is OR. Example:</p>
         * <p><code>[ {&quot;Key&quot;:&quot;KeyState&quot;, &quot;Values&quot;:[&quot;Enabled&quot;,&quot;Disabled&quot;]}, {&quot;Key&quot;:&quot;KeyState&quot;, &quot;Values&quot;:[&quot;PendingDeletion&quot;]}, {&quot;Key&quot;:&quot;KeySpec&quot;, &quot;Values&quot;:[&quot;Aliyun_AES_256&quot;]}]</code>. In this example, the semantics are:<code>(KeyState=Enabled OR KeyState=Disabled OR KeyState=PendingDeletion) AND (KeySpec=Aliyun_AES_ 256)</code>.</p>
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
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10</p>
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
