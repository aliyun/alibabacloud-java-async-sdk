// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSAuthorizedInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMPCoSAuthorizedInfoResponseBody</p>
 */
public class DescribeMPCoSAuthorizedInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMPCoSAuthorizedInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPCoSAuthorizedInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMPCoSAuthorizedInfoResponseBody build() {
            return new DescribeMPCoSAuthorizedInfoResponseBody(this);
        } 

    } 

    public static class AuthorizedPhaseList extends TeaModel {
        @NameInMap("PhaseId")
        private String phaseId;

        @NameInMap("PhaseName")
        private String phaseName;

        private AuthorizedPhaseList(Builder builder) {
            this.phaseId = builder.phaseId;
            this.phaseName = builder.phaseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedPhaseList create() {
            return builder().build();
        }

        /**
         * @return phaseId
         */
        public String getPhaseId() {
            return this.phaseId;
        }

        /**
         * @return phaseName
         */
        public String getPhaseName() {
            return this.phaseName;
        }

        public static final class Builder {
            private String phaseId; 
            private String phaseName; 

            /**
             * PhaseId.
             */
            public Builder phaseId(String phaseId) {
                this.phaseId = phaseId;
                return this;
            }

            /**
             * PhaseName.
             */
            public Builder phaseName(String phaseName) {
                this.phaseName = phaseName;
                return this;
            }

            public AuthorizedPhaseList build() {
                return new AuthorizedPhaseList(this);
            } 

        } 

    }
    public static class UnAuthorizedPhaseList extends TeaModel {
        @NameInMap("PhaseId")
        private String phaseId;

        @NameInMap("PhaseName")
        private String phaseName;

        private UnAuthorizedPhaseList(Builder builder) {
            this.phaseId = builder.phaseId;
            this.phaseName = builder.phaseName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnAuthorizedPhaseList create() {
            return builder().build();
        }

        /**
         * @return phaseId
         */
        public String getPhaseId() {
            return this.phaseId;
        }

        /**
         * @return phaseName
         */
        public String getPhaseName() {
            return this.phaseName;
        }

        public static final class Builder {
            private String phaseId; 
            private String phaseName; 

            /**
             * PhaseId.
             */
            public Builder phaseId(String phaseId) {
                this.phaseId = phaseId;
                return this;
            }

            /**
             * PhaseName.
             */
            public Builder phaseName(String phaseName) {
                this.phaseName = phaseName;
                return this;
            }

            public UnAuthorizedPhaseList build() {
                return new UnAuthorizedPhaseList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AuthorizedPhaseList")
        private java.util.List < AuthorizedPhaseList> authorizedPhaseList;

        @NameInMap("UnAuthorizedPhaseList")
        private java.util.List < UnAuthorizedPhaseList> unAuthorizedPhaseList;

        private Data(Builder builder) {
            this.authorizedPhaseList = builder.authorizedPhaseList;
            this.unAuthorizedPhaseList = builder.unAuthorizedPhaseList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizedPhaseList
         */
        public java.util.List < AuthorizedPhaseList> getAuthorizedPhaseList() {
            return this.authorizedPhaseList;
        }

        /**
         * @return unAuthorizedPhaseList
         */
        public java.util.List < UnAuthorizedPhaseList> getUnAuthorizedPhaseList() {
            return this.unAuthorizedPhaseList;
        }

        public static final class Builder {
            private java.util.List < AuthorizedPhaseList> authorizedPhaseList; 
            private java.util.List < UnAuthorizedPhaseList> unAuthorizedPhaseList; 

            /**
             * AuthorizedPhaseList.
             */
            public Builder authorizedPhaseList(java.util.List < AuthorizedPhaseList> authorizedPhaseList) {
                this.authorizedPhaseList = authorizedPhaseList;
                return this;
            }

            /**
             * UnAuthorizedPhaseList.
             */
            public Builder unAuthorizedPhaseList(java.util.List < UnAuthorizedPhaseList> unAuthorizedPhaseList) {
                this.unAuthorizedPhaseList = unAuthorizedPhaseList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
