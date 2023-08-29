// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrAndSlsProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlrAndSlsProjectResponseBody</p>
 */
public class CreateSlrAndSlsProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsInfo")
    private SlsInfo slsInfo;

    private CreateSlrAndSlsProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsInfo = builder.slsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrAndSlsProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsInfo
     */
    public SlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static final class Builder {
        private String requestId; 
        private SlsInfo slsInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about Log Service.
         */
        public Builder slsInfo(SlsInfo slsInfo) {
            this.slsInfo = slsInfo;
            return this;
        }

        public CreateSlrAndSlsProjectResponseBody build() {
            return new CreateSlrAndSlsProjectResponseBody(this);
        } 

    } 

    public static class SlsInfo extends TeaModel {
        @NameInMap("EndPoint")
        private String endPoint;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
        private String region;

        private SlsInfo(Builder builder) {
            this.endPoint = builder.endPoint;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsInfo create() {
            return builder().build();
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String endPoint; 
            private String logStore; 
            private String project; 
            private String region; 

            /**
             * The endpoint of Log Service.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * The Logstore of Log Service.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The project of Log Service.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The region where Log Service resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public SlsInfo build() {
                return new SlsInfo(this);
            } 

        } 

    }
}
