// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRoutineResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineResponseBody</p>
 */
public class GetRoutineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersions")
    private java.util.List < CodeVersions> codeVersions;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultRelatedRecord")
    private String defaultRelatedRecord;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List < Envs> envs;

    @com.aliyun.core.annotation.NameInMap("RelatedRecords")
    private java.util.List < RelatedRecords> relatedRecords;

    @com.aliyun.core.annotation.NameInMap("RelatedRoutes")
    private java.util.List < RelatedRoutes> relatedRoutes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRoutineResponseBody(Builder builder) {
        this.codeVersions = builder.codeVersions;
        this.createTime = builder.createTime;
        this.defaultRelatedRecord = builder.defaultRelatedRecord;
        this.description = builder.description;
        this.envs = builder.envs;
        this.relatedRecords = builder.relatedRecords;
        this.relatedRoutes = builder.relatedRoutes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeVersions
     */
    public java.util.List < CodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultRelatedRecord
     */
    public String getDefaultRelatedRecord() {
        return this.defaultRelatedRecord;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envs
     */
    public java.util.List < Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return relatedRecords
     */
    public java.util.List < RelatedRecords> getRelatedRecords() {
        return this.relatedRecords;
    }

    /**
     * @return relatedRoutes
     */
    public java.util.List < RelatedRoutes> getRelatedRoutes() {
        return this.relatedRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CodeVersions> codeVersions; 
        private String createTime; 
        private String defaultRelatedRecord; 
        private String description; 
        private java.util.List < Envs> envs; 
        private java.util.List < RelatedRecords> relatedRecords; 
        private java.util.List < RelatedRoutes> relatedRoutes; 
        private String requestId; 

        /**
         * <p>The code versions.</p>
         */
        public Builder codeVersions(java.util.List < CodeVersions> codeVersions) {
            this.codeVersions = codeVersions;
            return this;
        }

        /**
         * <p>The time when the routine was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:21Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The default record name to access.</p>
         * 
         * <strong>example:</strong>
         * <p>routine1.example.com</p>
         */
        public Builder defaultRelatedRecord(String defaultRelatedRecord) {
            this.defaultRelatedRecord = defaultRelatedRecord;
            return this;
        }

        /**
         * <p>The description of the routine.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The information about the environments.</p>
         */
        public Builder envs(java.util.List < Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The records associated with the routine.</p>
         */
        public Builder relatedRecords(java.util.List < RelatedRecords> relatedRecords) {
            this.relatedRecords = relatedRecords;
            return this;
        }

        /**
         * <p>The routes associated with the routine.</p>
         */
        public Builder relatedRoutes(java.util.List < RelatedRoutes> relatedRoutes) {
            this.relatedRoutes = relatedRoutes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoutineResponseBody build() {
            return new GetRoutineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoutineResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineResponseBody</p>
     */
    public static class CodeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeDescription")
        private String codeDescription;

        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        private CodeVersions(Builder builder) {
            this.codeDescription = builder.codeDescription;
            this.codeVersion = builder.codeVersion;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeVersions create() {
            return builder().build();
        }

        /**
         * @return codeDescription
         */
        public String getCodeDescription() {
            return this.codeDescription;
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private String codeDescription; 
            private String codeVersion; 
            private String createTime; 

            /**
             * <p>The description of the code version.</p>
             * 
             * <strong>example:</strong>
             * <p>test ver code desc</p>
             */
            public Builder codeDescription(String codeDescription) {
                this.codeDescription = codeDescription;
                return this;
            }

            /**
             * <p>The code version.</p>
             * 
             * <strong>example:</strong>
             * <p>1710120201067203242</p>
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * <p>The time when the code version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-11T01:23:21Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            public CodeVersions build() {
                return new CodeVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoutineResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineResponseBody</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanaryAreaList")
        private java.util.List < String > canaryAreaList;

        @com.aliyun.core.annotation.NameInMap("CanaryCodeVersion")
        private String canaryCodeVersion;

        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        private Envs(Builder builder) {
            this.canaryAreaList = builder.canaryAreaList;
            this.canaryCodeVersion = builder.canaryCodeVersion;
            this.codeVersion = builder.codeVersion;
            this.env = builder.env;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return canaryAreaList
         */
        public java.util.List < String > getCanaryAreaList() {
            return this.canaryAreaList;
        }

        /**
         * @return canaryCodeVersion
         */
        public String getCanaryCodeVersion() {
            return this.canaryCodeVersion;
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private java.util.List < String > canaryAreaList; 
            private String canaryCodeVersion; 
            private String codeVersion; 
            private String env; 
            private String specName; 

            /**
             * <p>The regions for canary release.</p>
             */
            public Builder canaryAreaList(java.util.List < String > canaryAreaList) {
                this.canaryAreaList = canaryAreaList;
                return this;
            }

            /**
             * <p>The version number for canary release.</p>
             * 
             * <strong>example:</strong>
             * <p>1710120201067577628</p>
             */
            public Builder canaryCodeVersion(String canaryCodeVersion) {
                this.canaryCodeVersion = canaryCodeVersion;
                return this;
            }

            /**
             * <p>The version number of the code in the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>1710120201067577628</p>
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * <p>The environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The specification.</p>
             * 
             * <strong>example:</strong>
             * <p>5ms</p>
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoutineResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineResponseBody</p>
     */
    public static class RelatedRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        private RelatedRecords(Builder builder) {
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedRecords create() {
            return builder().build();
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        public static final class Builder {
            private Long recordId; 
            private String recordName; 
            private Long siteId; 
            private String siteName; 

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>509348423011904</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The record name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-record-1.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54362329990032</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            public RelatedRecords build() {
                return new RelatedRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRoutineResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineResponseBody</p>
     */
    public static class RelatedRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Route")
        private String route;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private String routeId;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        private RelatedRoutes(Builder builder) {
            this.route = builder.route;
            this.routeId = builder.routeId;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedRoutes create() {
            return builder().build();
        }

        /**
         * @return route
         */
        public String getRoute() {
            return this.route;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        public static final class Builder {
            private String route; 
            private String routeId; 
            private Long siteId; 
            private String siteName; 

            /**
             * <p>The route.</p>
             * 
             * <strong>example:</strong>
             * <p><em>.example.com/path1</em></p>
             */
            public Builder route(String route) {
                this.route = route;
                return this;
            }

            /**
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d501cb8a2c951f32922d260040780c06</p>
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54362329990032</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            public RelatedRoutes build() {
                return new RelatedRoutes(this);
            } 

        } 

    }
}
