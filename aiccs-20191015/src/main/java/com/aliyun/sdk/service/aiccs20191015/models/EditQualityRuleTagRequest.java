// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link EditQualityRuleTagRequest} extends {@link RequestModel}
 *
 * <p>EditQualityRuleTagRequest</p>
 */
public class EditQualityRuleTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalysisTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AnalysisTypes> analysisTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private EditQualityRuleTagRequest(Builder builder) {
        super(builder);
        this.analysisTypes = builder.analysisTypes;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditQualityRuleTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisTypes
     */
    public java.util.List<AnalysisTypes> getAnalysisTypes() {
        return this.analysisTypes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EditQualityRuleTagRequest, Builder> {
        private java.util.List<AnalysisTypes> analysisTypes; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(EditQualityRuleTagRequest request) {
            super(request);
            this.analysisTypes = request.analysisTypes;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder analysisTypes(java.util.List<AnalysisTypes> analysisTypes) {
            this.putQueryParameter("AnalysisTypes", analysisTypes);
            this.analysisTypes = analysisTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public EditQualityRuleTagRequest build() {
            return new EditQualityRuleTagRequest(this);
        } 

    } 

    /**
     * 
     * {@link EditQualityRuleTagRequest} extends {@link TeaModel}
     *
     * <p>EditQualityRuleTagRequest</p>
     */
    public static class AnalysisTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AnalysisTypes(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisTypes create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AnalysisTypes model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AnalysisTypes build() {
                return new AnalysisTypes(this);
            } 

        } 

    }
}
