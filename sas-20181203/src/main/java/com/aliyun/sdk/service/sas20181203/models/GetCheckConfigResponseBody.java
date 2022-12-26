// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckConfigResponseBody</p>
 */
public class GetCheckConfigResponseBody extends TeaModel {
    @NameInMap("CycleDays")
    private java.util.List < Integer > cycleDays;

    @NameInMap("EndTime")
    private Integer endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Standards")
    private java.util.List < Standards> standards;

    @NameInMap("StartTime")
    private Integer startTime;

    private GetCheckConfigResponseBody(Builder builder) {
        this.cycleDays = builder.cycleDays;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.standards = builder.standards;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return cycleDays
     */
    public java.util.List < Integer > getCycleDays() {
        return this.cycleDays;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standards
     */
    public java.util.List < Standards> getStandards() {
        return this.standards;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List < Integer > cycleDays; 
        private Integer endTime; 
        private String requestId; 
        private java.util.List < Standards> standards; 
        private Integer startTime; 

        /**
         * CycleDays.
         */
        public Builder cycleDays(java.util.List < Integer > cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * 检查结束时间小时
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Standards.
         */
        public Builder standards(java.util.List < Standards> standards) {
            this.standards = standards;
            return this;
        }

        /**
         * 检查开始时间小时
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        public GetCheckConfigResponseBody build() {
            return new GetCheckConfigResponseBody(this);
        } 

    } 

    public static class Standards extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Standards(Builder builder) {
            this.id = builder.id;
            this.showName = builder.showName;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String showName; 
            private String status; 
            private String type; 

            /**
             * id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 名称
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
}
