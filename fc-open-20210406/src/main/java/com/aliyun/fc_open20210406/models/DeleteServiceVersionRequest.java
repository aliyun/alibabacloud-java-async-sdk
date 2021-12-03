// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceVersionRequest</p>
 */
public class DeleteServiceVersionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("versionId")
    private String versionId;


    private DeleteServiceVersionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceVersionRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String versionId; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>版本ID</p>
         */
        public Builder versionId(String versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        public DeleteServiceVersionRequest build() {
            return new DeleteServiceVersionRequest(this);
        } 

    } 

}
