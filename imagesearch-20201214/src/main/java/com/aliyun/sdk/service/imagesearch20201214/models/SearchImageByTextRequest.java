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
 * {@link SearchImageByTextRequest} extends {@link RequestModel}
 *
 * <p>SearchImageByTextRequest</p>
 */
public class SearchImageByTextRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistinctProductId")
    private Boolean distinctProductId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private SearchImageByTextRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distinctProductId = builder.distinctProductId;
        this.filter = builder.filter;
        this.instanceName = builder.instanceName;
        this.num = builder.num;
        this.start = builder.start;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageByTextRequest create() {
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
     * @return distinctProductId
     */
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
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

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SearchImageByTextRequest, Builder> {
        private String regionId; 
        private Boolean distinctProductId; 
        private String filter; 
        private String instanceName; 
        private Integer num; 
        private Integer start; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SearchImageByTextRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distinctProductId = request.distinctProductId;
            this.filter = request.filter;
            this.instanceName = request.instanceName;
            this.num = request.num;
            this.start = request.start;
            this.text = request.text;
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
         * DistinctProductId.
         */
        public Builder distinctProductId(Boolean distinctProductId) {
            this.putBodyParameter("DistinctProductId", distinctProductId);
            this.distinctProductId = distinctProductId;
            return this;
        }

        /**
         * Filter.
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SearchImageByTextRequest build() {
            return new SearchImageByTextRequest(this);
        } 

    } 

}
