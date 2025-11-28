// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListPrivacyRuleRequest} extends {@link RequestModel}
 *
 * <p>ListPrivacyRuleRequest</p>
 */
public class ListPrivacyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListPrivacyRuleRequest(Builder builder) {
        super(builder);
        this.num = builder.num;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivacyRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListPrivacyRuleRequest, Builder> {
        private Integer num; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivacyRuleRequest request) {
            super(request);
            this.num = request.num;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListPrivacyRuleRequest build() {
            return new ListPrivacyRuleRequest(this);
        } 

    } 

}
