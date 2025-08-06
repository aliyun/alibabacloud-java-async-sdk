// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAIStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIStatisResponseBody</p>
 */
public class GetAIStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIStatisList")
    private java.util.List<AIStatisList> AIStatisList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAIStatisResponseBody(Builder builder) {
        this.AIStatisList = builder.AIStatisList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIStatisList
     */
    public java.util.List<AIStatisList> getAIStatisList() {
        return this.AIStatisList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AIStatisList> AIStatisList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIStatisResponseBody model) {
            this.AIStatisList = model.AIStatisList;
            this.requestId = model.requestId;
        } 

        /**
         * AIStatisList.
         */
        public Builder AIStatisList(java.util.List<AIStatisList> AIStatisList) {
            this.AIStatisList = AIStatisList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIStatisResponseBody build() {
            return new GetAIStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIStatisResponseBody</p>
     */
    public static class AIStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        @com.aliyun.core.annotation.NameInMap("StatTimeUTC")
        private String statTimeUTC;

        private AIStatisList(Builder builder) {
            this.duration = builder.duration;
            this.statTime = builder.statTime;
            this.statTimeUTC = builder.statTimeUTC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIStatisList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return statTime
         */
        public String getStatTime() {
            return this.statTime;
        }

        /**
         * @return statTimeUTC
         */
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

        public static final class Builder {
            private Long duration; 
            private String statTime; 
            private String statTimeUTC; 

            private Builder() {
            } 

            private Builder(AIStatisList model) {
                this.duration = model.duration;
                this.statTime = model.statTime;
                this.statTimeUTC = model.statTimeUTC;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * StatTime.
             */
            public Builder statTime(String statTime) {
                this.statTime = statTime;
                return this;
            }

            /**
             * StatTimeUTC.
             */
            public Builder statTimeUTC(String statTimeUTC) {
                this.statTimeUTC = statTimeUTC;
                return this;
            }

            public AIStatisList build() {
                return new AIStatisList(this);
            } 

        } 

    }
}
