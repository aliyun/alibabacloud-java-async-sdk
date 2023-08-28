// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataSourceRequest</p>
 */
public class ModifyDataSourceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("dataSourceName")
    @Validation(required = true)
    private String dataSourceName;

    @Body
    @NameInMap("body")
    private java.util.Map < String, ? > body;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private ModifyDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataSourceRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifyDataSourceRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private java.util.Map < String, ? > body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * ## Sample responses
         * <p>
         * 
         * ### Success responses
         * 
         * ```json
         * {
         * 	"requestId": "0A6EB64B-B4C8-CF02-810F-E660812972FF",
         *     "result": []
         * }
         * ```
         * 
         * For more information, see [Response struct](~~465311~~).
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * WB01240825
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * The information about the index
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the request
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public ModifyDataSourceRequest build() {
            return new ModifyDataSourceRequest(this);
        } 

    } 

}
