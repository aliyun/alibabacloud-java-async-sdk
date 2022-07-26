// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectDeleteRequest} extends {@link RequestModel}
 *
 * <p>ProjectDeleteRequest</p>
 */
public class ProjectDeleteRequest extends Request {
    @Query
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    private ProjectDeleteRequest(Builder builder) {
        super(builder);
        this.thirdPartId = builder.thirdPartId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static final class Builder extends Request.Builder<ProjectDeleteRequest, Builder> {
        private String thirdPartId; 

        private Builder() {
            super();
        } 

        private Builder(ProjectDeleteRequest request) {
            super(request);
            this.thirdPartId = request.thirdPartId;
        } 

        /**
         * 第三方项目id
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putQueryParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        @Override
        public ProjectDeleteRequest build() {
            return new ProjectDeleteRequest(this);
        } 

    } 

}
