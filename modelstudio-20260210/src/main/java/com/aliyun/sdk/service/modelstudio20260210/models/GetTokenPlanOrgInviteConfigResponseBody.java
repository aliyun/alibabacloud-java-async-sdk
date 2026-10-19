// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetTokenPlanOrgInviteConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenPlanOrgInviteConfigResponseBody</p>
 */
public class GetTokenPlanOrgInviteConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTokenPlanOrgInviteConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenPlanOrgInviteConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTokenPlanOrgInviteConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data result of the current category statistics.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTokenPlanOrgInviteConfigResponseBody build() {
            return new GetTokenPlanOrgInviteConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTokenPlanOrgInviteConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenPlanOrgInviteConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoleId")
        private String defaultRoleId;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("SeatAssignStrategy")
        private String seatAssignStrategy;

        private Data(Builder builder) {
            this.defaultRoleId = builder.defaultRoleId;
            this.orgId = builder.orgId;
            this.seatAssignStrategy = builder.seatAssignStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultRoleId
         */
        public String getDefaultRoleId() {
            return this.defaultRoleId;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return seatAssignStrategy
         */
        public String getSeatAssignStrategy() {
            return this.seatAssignStrategy;
        }

        public static final class Builder {
            private String defaultRoleId; 
            private String orgId; 
            private String seatAssignStrategy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.defaultRoleId = model.defaultRoleId;
                this.orgId = model.orgId;
                this.seatAssignStrategy = model.seatAssignStrategy;
            } 

            /**
             * <p>The default organization role ID to assign. Valid values:</p>
             * <ul>
             * <li>SYSTEM_ROLE_ORG_ADMIN</li>
             * <li>SYSTEM_ROLE_ORG_MEMBER</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORG_MEMBER</p>
             */
            public Builder defaultRoleId(String defaultRoleId) {
                this.defaultRoleId = defaultRoleId;
                return this;
            }

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org_123456789</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The default seat allocation strategy. Valid values:</p>
             * <ul>
             * <li>HIGH_TO_LOW</li>
             * <li>LOW_TO_HIGH </li>
             * <li>NONE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder seatAssignStrategy(String seatAssignStrategy) {
                this.seatAssignStrategy = seatAssignStrategy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
