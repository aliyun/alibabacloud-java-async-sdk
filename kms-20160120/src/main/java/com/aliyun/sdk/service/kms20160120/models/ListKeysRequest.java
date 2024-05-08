// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The CMK filter. The filter consists of one or more key-value pairs. You can specify a maximum of 10 key-value pairs.
         * <p>
         * 
         * *   Key
         * 
         *     *   Description: the property that you want to filter.
         * 
         *     *   Type: string.
         * 
         *     *   Valid values:
         * 
         *         *   KeyState: the status of the CMK.
         *         *   KeySpec: the type of the CMK.
         *         *   KeyUsage: the usage of the CMK.
         *         *   ProtectionLevel: the protection level.
         *         *   CreatorType: the type of the creator.
         * 
         * *   Values
         * 
         *     *   Description: the value to be included after filtering.
         * 
         *     *   Format: string array.
         * 
         *     *   Length: 0 to 10.
         * 
         *     *   Valid values:
         * 
         *         *   When Key is set to KeyState, the value can be Enabled, Disabled, PendingDeletion, or PendingImport.
         * 
         *         *   When Key is set to KeySpec, the value can be Aliyun_AES\_256, Aliyun_SM4, RSA\_2048, EC_P256, EC_P256K, or EC_SM2.
         * 
         *             Note: You can create CMKs of the EC_SM2 or Aliyun_SM4 type only in regions where State Cryptography Administration (SCA)-certified managed HSMs reside. For more information about the regions, see [Supported regions](~~125803~~). If your region does not support EC_SM2 or Aliyun_SM4, the two values are ignored if they are specified.
         * 
         *         *   When Key is set to KeyUsage, the value can be ENCRYPT/DECRYPT or SIGN/VERIFY. ENCRYPT/DECRYPT indicates that the CMK is used to encrypt and decrypt data. SIGN/VERIFY indicates that the CMK is used to generate and verify digital signatures.
         * 
         *         *   When Key is set to ProtectionLevel, the value can be SOFTWARE (software) or HSM (hardware).
         * 
         *             You can set ProtectionLevel to HSM in only specific regions. For more information about the regions, see [Supported regions](~~125803~~). If your region does not support the value HSM, the value is ignored if the value is specified.
         * 
         *         *   If Key is set to CreatorType, the value can be User or Service. User indicates that CMKs created by the current account are queried. Service indicates that CMKs automatically created by other cloud services authorized by the current account are queried.
         * 
         * The logical relationship between different keys is AND, and the logical relationship between multiple items in the same key is OR. Example:
         * 
         * `[ {"Key":"KeyState", "Values":["Enabled","Disabled"]}, {"Key":"KeyState", "Values":["PendingDeletion"]}, {"Key":"KeySpec", "Values":["Aliyun_AES_256"]}]`. In this example, the semantics are:`(KeyState=Enabled OR KeyState=Disabled OR KeyState=PendingDeletion) AND (KeySpec=Aliyun_AES_ 256)`.
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10
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
