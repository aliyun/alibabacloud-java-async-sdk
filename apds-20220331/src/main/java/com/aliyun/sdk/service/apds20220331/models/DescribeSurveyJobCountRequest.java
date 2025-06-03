// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeSurveyJobCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeSurveyJobCountRequest</p>
 */
public class DescribeSurveyJobCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channelList")
    private java.util.List<String> channelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloudTypeList")
    private java.util.List<String> cloudTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private DescribeSurveyJobCountRequest(Builder builder) {
        super(builder);
        this.channelList = builder.channelList;
        this.cloudTypeList = builder.cloudTypeList;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSurveyJobCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelList
     */
    public java.util.List<String> getChannelList() {
        return this.channelList;
    }

    /**
     * @return cloudTypeList
     */
    public java.util.List<String> getCloudTypeList() {
        return this.cloudTypeList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSurveyJobCountRequest, Builder> {
        private java.util.List<String> channelList; 
        private java.util.List<String> cloudTypeList; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSurveyJobCountRequest request) {
            super(request);
            this.channelList = request.channelList;
            this.cloudTypeList = request.cloudTypeList;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * channelList.
         */
        public Builder channelList(java.util.List<String> channelList) {
            this.putBodyParameter("channelList", channelList);
            this.channelList = channelList;
            return this;
        }

        /**
         * cloudTypeList.
         */
        public Builder cloudTypeList(java.util.List<String> cloudTypeList) {
            this.putBodyParameter("cloudTypeList", cloudTypeList);
            this.cloudTypeList = cloudTypeList;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeSurveyJobCountRequest build() {
            return new DescribeSurveyJobCountRequest(this);
        } 

    } 

}
