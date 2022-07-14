// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeyPairsRequest</p>
 */
public class DescribeKeyPairsRequest extends Request {
    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeKeyPairsRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeKeyPairsRequest, Builder> {
        private String keyPairName; 
        private String pageNumber; 
        private String pageSize; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeyPairsRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.version = request.version;
        } 

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeKeyPairsRequest build() {
            return new DescribeKeyPairsRequest(this);
        } 

    } 

}
