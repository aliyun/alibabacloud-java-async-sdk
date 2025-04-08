// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetAudioFileRequest} extends {@link RequestModel}
 *
 * <p>GetAudioFileRequest</p>
 */
public class GetAudioFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetAudioFileRequest(Builder builder) {
        super(builder);
        this.audioResourceId = builder.audioResourceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAudioFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioResourceId
     */
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAudioFileRequest, Builder> {
        private String audioResourceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAudioFileRequest request) {
            super(request);
            this.audioResourceId = request.audioResourceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c1a06b46-302a-4c6e-928b-a43c0df485cf</p>
         */
        public Builder audioResourceId(String audioResourceId) {
            this.putQueryParameter("AudioResourceId", audioResourceId);
            this.audioResourceId = audioResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetAudioFileRequest build() {
            return new GetAudioFileRequest(this);
        } 

    } 

}
