// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link SearchImageByFilterRequest} extends {@link RequestModel}
 *
 * <p>SearchImageByFilterRequest</p>
 */
public class SearchImageByFilterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer num;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(maximum = 499)
    private Integer start;

    private SearchImageByFilterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filter = builder.filter;
        this.instanceName = builder.instanceName;
        this.num = builder.num;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageByFilterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<SearchImageByFilterRequest, Builder> {
        private String regionId; 
        private String filter; 
        private String instanceName; 
        private Integer num; 
        private Integer start; 

        private Builder() {
            super();
        } 

        private Builder(SearchImageByFilterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filter = request.filter;
            this.instanceName = request.instanceName;
            this.num = request.num;
            this.start = request.start;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demoinstance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Num.
         */
        public Builder num(Integer num) {
            this.putBodyParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Integer start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public SearchImageByFilterRequest build() {
            return new SearchImageByFilterRequest(this);
        } 

    } 

}
