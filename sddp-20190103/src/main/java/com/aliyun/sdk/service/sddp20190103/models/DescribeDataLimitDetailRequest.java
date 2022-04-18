// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitDetailRequest</p>
 */
public class DescribeDataLimitDetailRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NetworkType")
    private Integer networkType;

    private DescribeDataLimitDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return networkType
     */
    public Integer getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitDetailRequest, Builder> {
        private Long id; 
        private String lang; 
        private Integer networkType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitDetailRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.networkType = request.networkType;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(Integer networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public DescribeDataLimitDetailRequest build() {
            return new DescribeDataLimitDetailRequest(this);
        } 

    } 

}
