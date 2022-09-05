// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesRequest} extends {@link RequestModel}
 *
 * <p>SearchTracesRequest</p>
 */
public class SearchTracesRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ExclusionFilters")
    private java.util.List < ExclusionFilters> exclusionFilters;

    @Query
    @NameInMap("MinDuration")
    private Long minDuration;

    @Query
    @NameInMap("OperationName")
    private String operationName;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    @Query
    @NameInMap("ServiceIp")
    private String serviceIp;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private SearchTracesRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.exclusionFilters = builder.exclusionFilters;
        this.minDuration = builder.minDuration;
        this.operationName = builder.operationName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.reverse = builder.reverse;
        this.serviceIp = builder.serviceIp;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return exclusionFilters
     */
    public java.util.List < ExclusionFilters> getExclusionFilters() {
        return this.exclusionFilters;
    }

    /**
     * @return minDuration
     */
    public Long getMinDuration() {
        return this.minDuration;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return serviceIp
     */
    public String getServiceIp() {
        return this.serviceIp;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<SearchTracesRequest, Builder> {
        private Long endTime; 
        private java.util.List < ExclusionFilters> exclusionFilters; 
        private Long minDuration; 
        private String operationName; 
        private String pid; 
        private String regionId; 
        private Boolean reverse; 
        private String serviceIp; 
        private String serviceName; 
        private Long startTime; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(SearchTracesRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.exclusionFilters = request.exclusionFilters;
            this.minDuration = request.minDuration;
            this.operationName = request.operationName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.reverse = request.reverse;
            this.serviceIp = request.serviceIp;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
            this.tag = request.tag;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExclusionFilters.
         */
        public Builder exclusionFilters(java.util.List < ExclusionFilters> exclusionFilters) {
            this.putQueryParameter("ExclusionFilters", exclusionFilters);
            this.exclusionFilters = exclusionFilters;
            return this;
        }

        /**
         * MinDuration.
         */
        public Builder minDuration(Long minDuration) {
            this.putQueryParameter("MinDuration", minDuration);
            this.minDuration = minDuration;
            return this;
        }

        /**
         * OperationName.
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
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
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * ServiceIp.
         */
        public Builder serviceIp(String serviceIp) {
            this.putQueryParameter("ServiceIp", serviceIp);
            this.serviceIp = serviceIp;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public SearchTracesRequest build() {
            return new SearchTracesRequest(this);
        } 

    } 

    public static class ExclusionFilters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ExclusionFilters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExclusionFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExclusionFilters build() {
                return new ExclusionFilters(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
