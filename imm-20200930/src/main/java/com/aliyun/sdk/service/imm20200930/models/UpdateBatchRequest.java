// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBatchRequest} extends {@link RequestModel}
 *
 * <p>UpdateBatchRequest</p>
 */
public class UpdateBatchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List < Actions> actions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    private UpdateBatchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actions = builder.actions;
        this.id = builder.id;
        this.input = builder.input;
        this.projectName = builder.projectName;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return actions
     */
    public java.util.List < Actions> getActions() {
        return this.actions;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateBatchRequest, Builder> {
        private String regionId; 
        private java.util.List < Actions> actions; 
        private String id; 
        private Input input; 
        private String projectName; 
        private java.util.Map < String, ? > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBatchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actions = request.actions;
            this.id = request.id;
            this.input = request.input;
            this.projectName = request.projectName;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Actions.
         */
        public Builder actions(java.util.List < Actions> actions) {
            String actionsShrink = shrink(actions, "Actions", "json");
            this.putBodyParameter("Actions", actionsShrink);
            this.actions = actions;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateBatchRequest build() {
            return new UpdateBatchRequest(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < String > parameters;

        private Actions(Builder builder) {
            this.name = builder.name;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.List < String > getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > parameters; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List < String > parameters) {
                this.parameters = parameters;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
