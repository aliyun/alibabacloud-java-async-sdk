// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlaylistResponseBody</p>
 */
public class ListPlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramList")
    private java.util.List < ProgramList> programList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListPlaylistResponseBody(Builder builder) {
        this.programList = builder.programList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlaylistResponseBody create() {
        return builder().build();
    }

    /**
     * @return programList
     */
    public java.util.List < ProgramList> getProgramList() {
        return this.programList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < ProgramList> programList; 
        private String requestId; 
        private Integer total; 

        /**
         * ProgramList.
         */
        public Builder programList(java.util.List < ProgramList> programList) {
            this.programList = programList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListPlaylistResponseBody build() {
            return new ListPlaylistResponseBody(this);
        } 

    } 

    public static class ProgramList extends TeaModel {
        @NameInMap("CasterId")
        private String casterId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ProgramId")
        private String programId;

        @NameInMap("ProgramName")
        private String programName;

        @NameInMap("RepeatNumber")
        private Integer repeatNumber;

        @NameInMap("Status")
        private Integer status;

        private ProgramList(Builder builder) {
            this.casterId = builder.casterId;
            this.domainName = builder.domainName;
            this.programId = builder.programId;
            this.programName = builder.programName;
            this.repeatNumber = builder.repeatNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramList create() {
            return builder().build();
        }

        /**
         * @return casterId
         */
        public String getCasterId() {
            return this.casterId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return programId
         */
        public String getProgramId() {
            return this.programId;
        }

        /**
         * @return programName
         */
        public String getProgramName() {
            return this.programName;
        }

        /**
         * @return repeatNumber
         */
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String casterId; 
            private String domainName; 
            private String programId; 
            private String programName; 
            private Integer repeatNumber; 
            private Integer status; 

            /**
             * CasterId.
             */
            public Builder casterId(String casterId) {
                this.casterId = casterId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ProgramId.
             */
            public Builder programId(String programId) {
                this.programId = programId;
                return this;
            }

            /**
             * ProgramName.
             */
            public Builder programName(String programName) {
                this.programName = programName;
                return this;
            }

            /**
             * RepeatNumber.
             */
            public Builder repeatNumber(Integer repeatNumber) {
                this.repeatNumber = repeatNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ProgramList build() {
                return new ProgramList(this);
            } 

        } 

    }
}
