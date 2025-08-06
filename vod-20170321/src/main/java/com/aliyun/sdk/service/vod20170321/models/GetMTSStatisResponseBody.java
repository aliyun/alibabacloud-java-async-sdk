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
 * {@link GetMTSStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetMTSStatisResponseBody</p>
 */
public class GetMTSStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MTSStatisBySpecList")
    private MTSStatisBySpecList MTSStatisBySpecList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMTSStatisResponseBody(Builder builder) {
        this.MTSStatisBySpecList = builder.MTSStatisBySpecList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMTSStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return MTSStatisBySpecList
     */
    public MTSStatisBySpecList getMTSStatisBySpecList() {
        return this.MTSStatisBySpecList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MTSStatisBySpecList MTSStatisBySpecList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMTSStatisResponseBody model) {
            this.MTSStatisBySpecList = model.MTSStatisBySpecList;
            this.requestId = model.requestId;
        } 

        /**
         * MTSStatisBySpecList.
         */
        public Builder MTSStatisBySpecList(MTSStatisBySpecList MTSStatisBySpecList) {
            this.MTSStatisBySpecList = MTSStatisBySpecList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMTSStatisResponseBody build() {
            return new GetMTSStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMTSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMTSStatisResponseBody</p>
     */
    public static class MTSStatisDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        @com.aliyun.core.annotation.NameInMap("StatTimeUTC")
        private String statTimeUTC;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private MTSStatisDO(Builder builder) {
            this.duration = builder.duration;
            this.specification = builder.specification;
            this.statTime = builder.statTime;
            this.statTimeUTC = builder.statTimeUTC;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MTSStatisDO create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long duration; 
            private String specification; 
            private String statTime; 
            private String statTimeUTC; 
            private String userId; 

            private Builder() {
            } 

            private Builder(MTSStatisDO model) {
                this.duration = model.duration;
                this.specification = model.specification;
                this.statTime = model.statTime;
                this.statTimeUTC = model.statTimeUTC;
                this.userId = model.userId;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
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

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MTSStatisDO build() {
                return new MTSStatisDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMTSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMTSStatisResponseBody</p>
     */
    public static class MTSStatisDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MTSStatisDO")
        private java.util.List<MTSStatisDO> MTSStatisDO;

        private MTSStatisDOList(Builder builder) {
            this.MTSStatisDO = builder.MTSStatisDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MTSStatisDOList create() {
            return builder().build();
        }

        /**
         * @return MTSStatisDO
         */
        public java.util.List<MTSStatisDO> getMTSStatisDO() {
            return this.MTSStatisDO;
        }

        public static final class Builder {
            private java.util.List<MTSStatisDO> MTSStatisDO; 

            private Builder() {
            } 

            private Builder(MTSStatisDOList model) {
                this.MTSStatisDO = model.MTSStatisDO;
            } 

            /**
             * MTSStatisDO.
             */
            public Builder MTSStatisDO(java.util.List<MTSStatisDO> MTSStatisDO) {
                this.MTSStatisDO = MTSStatisDO;
                return this;
            }

            public MTSStatisDOList build() {
                return new MTSStatisDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMTSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMTSStatisResponseBody</p>
     */
    public static class MTSStatisBySpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MTSStatisDOList")
        private MTSStatisDOList MTSStatisDOList;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        private MTSStatisBySpec(Builder builder) {
            this.MTSStatisDOList = builder.MTSStatisDOList;
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MTSStatisBySpec create() {
            return builder().build();
        }

        /**
         * @return MTSStatisDOList
         */
        public MTSStatisDOList getMTSStatisDOList() {
            return this.MTSStatisDOList;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private MTSStatisDOList MTSStatisDOList; 
            private String specification; 

            private Builder() {
            } 

            private Builder(MTSStatisBySpec model) {
                this.MTSStatisDOList = model.MTSStatisDOList;
                this.specification = model.specification;
            } 

            /**
             * MTSStatisDOList.
             */
            public Builder MTSStatisDOList(MTSStatisDOList MTSStatisDOList) {
                this.MTSStatisDOList = MTSStatisDOList;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            public MTSStatisBySpec build() {
                return new MTSStatisBySpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMTSStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetMTSStatisResponseBody</p>
     */
    public static class MTSStatisBySpecList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MTSStatisBySpec")
        private java.util.List<MTSStatisBySpec> MTSStatisBySpec;

        private MTSStatisBySpecList(Builder builder) {
            this.MTSStatisBySpec = builder.MTSStatisBySpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MTSStatisBySpecList create() {
            return builder().build();
        }

        /**
         * @return MTSStatisBySpec
         */
        public java.util.List<MTSStatisBySpec> getMTSStatisBySpec() {
            return this.MTSStatisBySpec;
        }

        public static final class Builder {
            private java.util.List<MTSStatisBySpec> MTSStatisBySpec; 

            private Builder() {
            } 

            private Builder(MTSStatisBySpecList model) {
                this.MTSStatisBySpec = model.MTSStatisBySpec;
            } 

            /**
             * MTSStatisBySpec.
             */
            public Builder MTSStatisBySpec(java.util.List<MTSStatisBySpec> MTSStatisBySpec) {
                this.MTSStatisBySpec = MTSStatisBySpec;
                return this;
            }

            public MTSStatisBySpecList build() {
                return new MTSStatisBySpecList(this);
            } 

        } 

    }
}
