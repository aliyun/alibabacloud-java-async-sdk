// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSlrAndSlsProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlrAndSlsProjectResponseBody</p>
 */
public class CreateSlrAndSlsProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsInfo")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>fe33a379-5053-4f22-a73c-826e2b44355d</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about Log Service.</p>
         */
        public Builder slsInfo(SlsInfo slsInfo) {
            this.slsInfo = slsInfo;
            return this;
        }

        public CreateSlrAndSlsProjectResponseBody build() {
            return new CreateSlrAndSlsProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSlrAndSlsProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSlrAndSlsProjectResponseBody</p>
     */
    public static class SlsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
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
             * <p>The endpoint of Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.log.*.com</p>
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * <p>The Logstore of Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn-edge-trlog</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The project of Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>dcdn-edge-rtlog-cn-cfc7****</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region where Log Service resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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
