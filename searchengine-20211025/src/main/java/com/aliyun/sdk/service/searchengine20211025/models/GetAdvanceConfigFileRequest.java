// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvanceConfigFileRequest} extends {@link RequestModel}
 *
 * <p>GetAdvanceConfigFileRequest</p>
 */
public class GetAdvanceConfigFileRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Query
    @NameInMap("fileName")
    @Validation(required = true)
    private String fileName;

    private GetAdvanceConfigFileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvanceConfigFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GetAdvanceConfigFileRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GetAdvanceConfigFileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.fileName = request.fileName;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the configuration
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * The name of the file
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GetAdvanceConfigFileRequest build() {
            return new GetAdvanceConfigFileRequest(this);
        } 

    } 

}
