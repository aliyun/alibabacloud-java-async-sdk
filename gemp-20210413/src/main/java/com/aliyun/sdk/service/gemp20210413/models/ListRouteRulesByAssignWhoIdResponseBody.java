// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesByAssignWhoIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteRulesByAssignWhoIdResponseBody</p>
 */
public class ListRouteRulesByAssignWhoIdResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListRouteRulesByAssignWhoIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRulesByAssignWhoIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRouteRulesByAssignWhoIdResponseBody build() {
            return new ListRouteRulesByAssignWhoIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("ruleName")
        private String ruleName;

        @NameInMap("tenantRamId")
        private Long tenantRamId;

        private Data(Builder builder) {
            this.id = builder.id;
            this.ruleName = builder.ruleName;
            this.tenantRamId = builder.tenantRamId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return tenantRamId
         */
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        public static final class Builder {
            private Long id; 
            private String ruleName; 
            private Long tenantRamId; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * tenantRamId.
             */
            public Builder tenantRamId(Long tenantRamId) {
                this.tenantRamId = tenantRamId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
