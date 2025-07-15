// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlaylistResponseBody</p>
 */
public class ListPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramList")
    private java.util.List<ProgramList> programList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return programList
     */
    public java.util.List<ProgramList> getProgramList() {
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
        private java.util.List<ProgramList> programList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListPlaylistResponseBody model) {
            this.programList = model.programList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The episode lists.</p>
         */
        public Builder programList(java.util.List<ProgramList> programList) {
            this.programList = programList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of episode lists returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListPlaylistResponseBody build() {
            return new ListPlaylistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPlaylistResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlaylistResponseBody</p>
     */
    public static class ProgramList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasterId")
        private String casterId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ProgramId")
        private String programId;

        @com.aliyun.core.annotation.NameInMap("ProgramName")
        private String programName;

        @com.aliyun.core.annotation.NameInMap("RepeatNumber")
        private Integer repeatNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ProgramList model) {
                this.casterId = model.casterId;
                this.domainName = model.domainName;
                this.programId = model.programId;
                this.programName = model.programName;
                this.repeatNumber = model.repeatNumber;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the production studio to which the episode list belongs. You can use the ID as a request parameter in the API operation that is used to add a layout to the virtual studio, delete a layout in the virtual studio, modify a layout of the virtual studio, or query layouts of the virtual studio.</p>
             * 
             * <strong>example:</strong>
             * <p>casdfasdfasfdasdflkasjdflaj****</p>
             */
            public Builder casterId(String casterId) {
                this.casterId = casterId;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the episode list.</p>
             * 
             * <strong>example:</strong>
             * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
             */
            public Builder programId(String programId) {
                this.programId = programId;
                return this;
            }

            /**
             * <p>The name of the episode list.</p>
             * 
             * <strong>example:</strong>
             * <p>playlist1</p>
             */
            public Builder programName(String programName) {
                this.programName = programName;
                return this;
            }

            /**
             * <p>The number of playbacks after the first playback is complete. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): specifies that the episode list is played only once.</li>
             * <li><strong>-1</strong>: specifies that the episode list is played in loop mode.</li>
             * <li>Positive integer: specifies the number of times the episode list repeats after the first playback is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder repeatNumber(Integer repeatNumber) {
                this.repeatNumber = repeatNumber;
                return this;
            }

            /**
             * <p>The status of the episode list. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: stopped</li>
             * <li><strong>1</strong>: running</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
