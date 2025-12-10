// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link PublishExperimentRequest} extends {@link RequestModel}
 *
 * <p>PublishExperimentRequest</p>
 */
public class PublishExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    private PublishExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishExperimentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    public static final class Builder extends Request.Builder<PublishExperimentRequest, Builder> {
        private String experimentId; 
        private String folderId; 

        private Builder() {
            super();
        } 

        private Builder(PublishExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.folderId = request.folderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public PublishExperimentRequest build() {
            return new PublishExperimentRequest(this);
        } 

    } 

}
