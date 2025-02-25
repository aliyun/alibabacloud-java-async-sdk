// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDcdnRealTimeLogProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnRealTimeLogProjectRequest</p>
 */
public class DeleteDcdnRealTimeLogProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private DeleteDcdnRealTimeLogProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnRealTimeLogProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<DeleteDcdnRealTimeLogProjectRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnRealTimeLogProjectRequest request) {
            super(request);
            this.projectName = request.projectName;
        } 

        /**
         * <p>The name of a real-time log delivery project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public DeleteDcdnRealTimeLogProjectRequest build() {
            return new DeleteDcdnRealTimeLogProjectRequest(this);
        } 

    } 

}
