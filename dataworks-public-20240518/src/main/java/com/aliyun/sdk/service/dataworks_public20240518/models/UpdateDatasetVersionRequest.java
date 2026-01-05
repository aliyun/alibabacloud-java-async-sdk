// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetVersionRequest</p>
 */
public class UpdateDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private UpdateDatasetVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetVersionRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetVersionRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dataset version description. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The dataset version ID. Only DataWorks datasets can be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-datasetVersion:3pXXXb8o0ngr07njhps1
         * :2</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateDatasetVersionRequest build() {
            return new UpdateDatasetVersionRequest(this);
        } 

    } 

}
