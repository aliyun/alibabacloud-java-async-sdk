// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveAppRecordConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveAppRecordConfigRequest</p>
 */
public class AddLiveAppRecordConfigRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OnDemand")
    private Integer onDemand;

    @Query
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    @Validation(required = true)
    private String ossEndpoint;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecordFormat")
    private java.util.List < RecordFormat> recordFormat;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    @Query
    @NameInMap("TranscodeRecordFormat")
    private java.util.List < TranscodeRecordFormat> transcodeRecordFormat;

    @Query
    @NameInMap("TranscodeTemplates")
    private java.util.List < String > transcodeTemplates;

    private AddLiveAppRecordConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.onDemand = builder.onDemand;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ownerId = builder.ownerId;
        this.recordFormat = builder.recordFormat;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
        this.transcodeRecordFormat = builder.transcodeRecordFormat;
        this.transcodeTemplates = builder.transcodeTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveAppRecordConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return onDemand
     */
    public Integer getOnDemand() {
        return this.onDemand;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recordFormat
     */
    public java.util.List < RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return transcodeRecordFormat
     */
    public java.util.List < TranscodeRecordFormat> getTranscodeRecordFormat() {
        return this.transcodeRecordFormat;
    }

    /**
     * @return transcodeTemplates
     */
    public java.util.List < String > getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public static final class Builder extends Request.Builder<AddLiveAppRecordConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String endTime; 
        private Integer onDemand; 
        private String ossBucket; 
        private String ossEndpoint; 
        private Long ownerId; 
        private java.util.List < RecordFormat> recordFormat; 
        private String securityToken; 
        private String startTime; 
        private String streamName; 
        private java.util.List < TranscodeRecordFormat> transcodeRecordFormat; 
        private java.util.List < String > transcodeTemplates; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveAppRecordConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.onDemand = request.onDemand;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.ownerId = request.ownerId;
            this.recordFormat = request.recordFormat;
            this.securityToken = request.securityToken;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
            this.transcodeRecordFormat = request.transcodeRecordFormat;
            this.transcodeTemplates = request.transcodeTemplates;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OnDemand.
         */
        public Builder onDemand(Integer onDemand) {
            this.putQueryParameter("OnDemand", onDemand);
            this.onDemand = onDemand;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RecordFormat.
         */
        public Builder recordFormat(java.util.List < RecordFormat> recordFormat) {
            this.putQueryParameter("RecordFormat", recordFormat);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * TranscodeRecordFormat.
         */
        public Builder transcodeRecordFormat(java.util.List < TranscodeRecordFormat> transcodeRecordFormat) {
            this.putQueryParameter("TranscodeRecordFormat", transcodeRecordFormat);
            this.transcodeRecordFormat = transcodeRecordFormat;
            return this;
        }

        /**
         * TranscodeTemplates.
         */
        public Builder transcodeTemplates(java.util.List < String > transcodeTemplates) {
            this.putQueryParameter("TranscodeTemplates", transcodeTemplates);
            this.transcodeTemplates = transcodeTemplates;
            return this;
        }

        @Override
        public AddLiveAppRecordConfigRequest build() {
            return new AddLiveAppRecordConfigRequest(this);
        } 

    } 

    public static class RecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * SliceDuration.
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * SliceOssObjectPrefix.
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
    public static class TranscodeRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private TranscodeRecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeRecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * SliceDuration.
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * SliceOssObjectPrefix.
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public TranscodeRecordFormat build() {
                return new TranscodeRecordFormat(this);
            } 

        } 

    }
}
