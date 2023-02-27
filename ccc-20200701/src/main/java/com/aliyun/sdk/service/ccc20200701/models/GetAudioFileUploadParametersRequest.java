// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAudioFileUploadParametersRequest} extends {@link RequestModel}
 *
 * <p>GetAudioFileUploadParametersRequest</p>
 */
public class GetAudioFileUploadParametersRequest extends Request {
    @Query
    @NameInMap("AudioFileName")
    @Validation(required = true)
    private String audioFileName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetAudioFileUploadParametersRequest(Builder builder) {
        super(builder);
        this.audioFileName = builder.audioFileName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAudioFileUploadParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFileName
     */
    public String getAudioFileName() {
        return this.audioFileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAudioFileUploadParametersRequest, Builder> {
        private String audioFileName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAudioFileUploadParametersRequest request) {
            super(request);
            this.audioFileName = request.audioFileName;
            this.instanceId = request.instanceId;
        } 

        /**
         * AudioFileName.
         */
        public Builder audioFileName(String audioFileName) {
            this.putQueryParameter("AudioFileName", audioFileName);
            this.audioFileName = audioFileName;
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
        public GetAudioFileUploadParametersRequest build() {
            return new GetAudioFileUploadParametersRequest(this);
        } 

    } 

}
