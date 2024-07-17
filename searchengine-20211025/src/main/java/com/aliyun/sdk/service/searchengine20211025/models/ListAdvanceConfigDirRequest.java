// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigDirRequest} extends {@link RequestModel}
 *
 * <p>ListAdvanceConfigDirRequest</p>
 */
public class ListAdvanceConfigDirRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dirName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dirName;

    private ListAdvanceConfigDirRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.dirName = builder.dirName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigDirRequest create() {
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
     * @return dirName
     */
    public String getDirName() {
        return this.dirName;
    }

    public static final class Builder extends Request.Builder<ListAdvanceConfigDirRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String dirName; 

        private Builder() {
            super();
        } 

        private Builder(ListAdvanceConfigDirRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.dirName = request.dirName;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The configuration name.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * The name of the directory
         */
        public Builder dirName(String dirName) {
            this.putQueryParameter("dirName", dirName);
            this.dirName = dirName;
            return this;
        }

        @Override
        public ListAdvanceConfigDirRequest build() {
            return new ListAdvanceConfigDirRequest(this);
        } 

    } 

}
