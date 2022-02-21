// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSceneRequest} extends {@link RequestModel}
 *
 * <p>AddSceneRequest</p>
 */
public class AddSceneRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private String projectId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private AddSceneRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddSceneRequest, Builder> {
        private String name; 
        private String projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddSceneRequest response) {
            super(response);
            this.name = response.name;
            this.projectId = response.projectId;
            this.type = response.type;
        } 

        /**
         * 场景名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 场景类型 3D模型：MODEL_3D  全景图片：PIC  全景视频：VIDEO 混合：MIX
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddSceneRequest build() {
            return new AddSceneRequest(this);
        } 

    } 

}
