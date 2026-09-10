// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecDataCheckToggleRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckToggleRequest</p>
 */
public class ExecDataCheckToggleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Params> params;

    private ExecDataCheckToggleRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckToggleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public java.util.List<Params> getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ExecDataCheckToggleRequest, Builder> {
        private java.util.List<Params> params; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckToggleRequest request) {
            super(request);
            this.params = request.params;
        } 

        /**
         * <p>The task scheduling parameter list. Each item must contain id, lastBatchId, and isScheduled.</p>
         * <p>This parameter is required.</p>
         */
        public Builder params(java.util.List<Params> params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public ExecDataCheckToggleRequest build() {
            return new ExecDataCheckToggleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecDataCheckToggleRequest} extends {@link TeaModel}
     *
     * <p>ExecDataCheckToggleRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isScheduled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer isScheduled;

        @com.aliyun.core.annotation.NameInMap("lastBatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long lastBatchId;

        private Params(Builder builder) {
            this.id = builder.id;
            this.isScheduled = builder.isScheduled;
            this.lastBatchId = builder.lastBatchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isScheduled
         */
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        /**
         * @return lastBatchId
         */
        public Long getLastBatchId() {
            return this.lastBatchId;
        }

        public static final class Builder {
            private Long id; 
            private Integer isScheduled; 
            private Long lastBatchId; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.id = model.id;
                this.isScheduled = model.isScheduled;
                this.lastBatchId = model.lastBatchId;
            } 

            /**
             * <p>The task ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Specifies whether to enable scheduling. Valid values:</p>
             * <ul>
             * <li>0: Disabled.</li>
             * <li>1: Enabled.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isScheduled(Integer isScheduled) {
                this.isScheduled = isScheduled;
                return this;
            }

            /**
             * <p>The most recent batch number.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder lastBatchId(Long lastBatchId) {
                this.lastBatchId = lastBatchId;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
