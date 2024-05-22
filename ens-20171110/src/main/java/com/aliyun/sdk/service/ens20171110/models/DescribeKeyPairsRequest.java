// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeyPairsRequest</p>
 */
public class DescribeKeyPairsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private DescribeKeyPairsRequest(Builder builder) {
        super(builder);
        this.keyPairId = builder.keyPairId;
        this.keyPairName = builder.keyPairName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyPairsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeKeyPairsRequest, Builder> {
        private String keyPairId; 
        private String keyPairName; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeyPairsRequest request) {
            super(request);
            this.keyPairId = request.keyPairId;
            this.keyPairName = request.keyPairName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the key pair.
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain the following characters:
         * <p>
         * 
         * *   Digits
         * *   :
         * *   \_
         * *   *
         * 
         * You can specify only one name. By default, all key pairs are queried.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The page number of the returned page. Valid values: integers that are greater than 0. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: integers that are greater than 0. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeKeyPairsRequest build() {
            return new DescribeKeyPairsRequest(this);
        } 

    } 

}
