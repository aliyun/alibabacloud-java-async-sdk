// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditQualityRuleTagRequest} extends {@link RequestModel}
 *
 * <p>EditQualityRuleTagRequest</p>
 */
public class EditQualityRuleTagRequest extends Request {
    @Query
    @NameInMap("AnalysisTypes")
    @Validation(required = true)
    private java.util.List < AnalysisTypes> analysisTypes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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
    public java.util.List < AnalysisTypes> getAnalysisTypes() {
        return this.analysisTypes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EditQualityRuleTagRequest, Builder> {
        private java.util.List < AnalysisTypes> analysisTypes; 
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
         * AnalysisTypes.
         */
        public Builder analysisTypes(java.util.List < AnalysisTypes> analysisTypes) {
            this.putQueryParameter("AnalysisTypes", analysisTypes);
            this.analysisTypes = analysisTypes;
            return this;
        }

        /**
         * InstanceId.
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

    public static class AnalysisTypes extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
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
