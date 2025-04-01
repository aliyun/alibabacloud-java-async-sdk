// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateComputeQuotaScheduleRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeQuotaScheduleRequest</p>
 */
public class UpdateComputeQuotaScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<UpdateComputeQuotaScheduleRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleTimezone")
    private String scheduleTimezone;

    private UpdateComputeQuotaScheduleRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.body = builder.body;
        this.scheduleTimezone = builder.scheduleTimezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeQuotaScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return body
     */
    public java.util.List<UpdateComputeQuotaScheduleRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return scheduleTimezone
     */
    public String getScheduleTimezone() {
        return this.scheduleTimezone;
    }

    public static final class Builder extends Request.Builder<UpdateComputeQuotaScheduleRequest, Builder> {
        private String nickname; 
        private java.util.List<UpdateComputeQuotaScheduleRequestBody> body; 
        private String scheduleTimezone; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeQuotaScheduleRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.body = request.body;
            this.scheduleTimezone = request.scheduleTimezone;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         */
        public Builder body(java.util.List<UpdateComputeQuotaScheduleRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * scheduleTimezone.
         */
        public Builder scheduleTimezone(String scheduleTimezone) {
            this.putQueryParameter("scheduleTimezone", scheduleTimezone);
            this.scheduleTimezone = scheduleTimezone;
            return this;
        }

        @Override
        public UpdateComputeQuotaScheduleRequest build() {
            return new UpdateComputeQuotaScheduleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComputeQuotaScheduleRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeQuotaScheduleRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("at")
        @com.aliyun.core.annotation.Validation(required = true)
        private String at;

        private Condition(Builder builder) {
            this.at = builder.at;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return at
         */
        public String getAt() {
            return this.at;
        }

        public static final class Builder {
            private String at; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.at = model.at;
            } 

            /**
             * <p>The start time when the quota plan takes effect.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00</p>
             */
            public Builder at(String at) {
                this.at = at;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateComputeQuotaScheduleRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeQuotaScheduleRequest</p>
     */
    public static class UpdateComputeQuotaScheduleRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("plan")
        @com.aliyun.core.annotation.Validation(required = true)
        private String plan;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private UpdateComputeQuotaScheduleRequestBody(Builder builder) {
            this.condition = builder.condition;
            this.plan = builder.plan;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateComputeQuotaScheduleRequestBody create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public Condition getCondition() {
            return this.condition;
        }

        /**
         * @return plan
         */
        public String getPlan() {
            return this.plan;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Condition condition; 
            private String plan; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpdateComputeQuotaScheduleRequestBody model) {
                this.condition = model.condition;
                this.plan = model.plan;
                this.type = model.type;
            } 

            /**
             * <p>The value of effective condition.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The name of the quota plan.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder plan(String plan) {
                this.plan = plan;
                return this;
            }

            /**
             * <p>The type of the quota plan.</p>
             * <blockquote>
             * <p>Notice: Currently, only daily is supported.</notice></p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>daily</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UpdateComputeQuotaScheduleRequestBody build() {
                return new UpdateComputeQuotaScheduleRequestBody(this);
            } 

        } 

    }
}
