// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ChannelAssemblySourceLocation} extends {@link TeaModel}
 *
 * <p>ChannelAssemblySourceLocation</p>
 */
public class ChannelAssemblySourceLocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("SegmentDeliveryConfigurations")
    private String segmentDeliveryConfigurations;

    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    private String sourceLocationName;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    private ChannelAssemblySourceLocation(Builder builder) {
        this.arn = builder.arn;
        this.baseUrl = builder.baseUrl;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.segmentDeliveryConfigurations = builder.segmentDeliveryConfigurations;
        this.sourceLocationName = builder.sourceLocationName;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelAssemblySourceLocation create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return segmentDeliveryConfigurations
     */
    public String getSegmentDeliveryConfigurations() {
        return this.segmentDeliveryConfigurations;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder {
        private String arn; 
        private String baseUrl; 
        private String gmtCreate; 
        private String gmtModified; 
        private String segmentDeliveryConfigurations; 
        private String sourceLocationName; 
        private Integer state; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * BaseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * SegmentDeliveryConfigurations.
         */
        public Builder segmentDeliveryConfigurations(String segmentDeliveryConfigurations) {
            this.segmentDeliveryConfigurations = segmentDeliveryConfigurations;
            return this;
        }

        /**
         * SourceLocationName.
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        public ChannelAssemblySourceLocation build() {
            return new ChannelAssemblySourceLocation(this);
        } 

    } 

}
