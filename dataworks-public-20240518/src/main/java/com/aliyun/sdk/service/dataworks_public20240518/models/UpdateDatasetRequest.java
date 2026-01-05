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
 * {@link UpdateDatasetRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetRequest</p>
 */
public class UpdateDatasetRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Readme")
    private String readme;

    private UpdateDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.id = builder.id;
        this.name = builder.name;
        this.readme = builder.readme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String id; 
        private String name; 
        private String readme; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.id = request.id;
            this.name = request.name;
            this.readme = request.readme;
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
         * <p>The dataset description. Length not exceeding 1024.</p>
         * 
         * <strong>example:</strong>
         * <p>new comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The dataset ID. Only DataWorks datasets are supported for update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The dataset name. A non-empty string, length not exceeding 128.</p>
         * 
         * <strong>example:</strong>
         * <p>test_oss_dataset_new</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The user guide, supports Markdown formatted rich text.</p>
         * 
         * <strong>example:</strong>
         * <h2>introduction</h2>
         */
        public Builder readme(String readme) {
            this.putBodyParameter("Readme", readme);
            this.readme = readme;
            return this;
        }

        @Override
        public UpdateDatasetRequest build() {
            return new UpdateDatasetRequest(this);
        } 

    } 

}
