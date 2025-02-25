// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineUserInfoResponseBody</p>
 */
public class GetRoutineUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Routines")
    private java.util.List<Routines> routines;

    @com.aliyun.core.annotation.NameInMap("Subdomains")
    private java.util.List<String> subdomains;

    private GetRoutineUserInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routines = builder.routines;
        this.subdomains = builder.subdomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineUserInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routines
     */
    public java.util.List<Routines> getRoutines() {
        return this.routines;
    }

    /**
     * @return subdomains
     */
    public java.util.List<String> getSubdomains() {
        return this.subdomains;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Routines> routines; 
        private java.util.List<String> subdomains; 

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

        /**
         * <p>The routines.</p>
         */
        public Builder routines(java.util.List<Routines> routines) {
            this.routines = routines;
            return this;
        }

        /**
         * <p>The subdomains.</p>
         */
        public Builder subdomains(java.util.List<String> subdomains) {
            this.subdomains = subdomains;
            return this;
        }

        public GetRoutineUserInfoResponseBody build() {
            return new GetRoutineUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoutineUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoutineUserInfoResponseBody</p>
     */
    public static class Routines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        private Routines(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.routineName = builder.routineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routines create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String routineName; 

            /**
             * <p>The time when the routine was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-11T01:23:02.883361712Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The routine description, which is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The routine name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-routine1</p>
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            public Routines build() {
                return new Routines(this);
            } 

        } 

    }
}
