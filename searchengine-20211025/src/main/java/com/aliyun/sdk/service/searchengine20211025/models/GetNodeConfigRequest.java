// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>GetNodeConfigRequest</p>
 */
public class GetNodeConfigRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clusterName")
    private String clusterName;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("type")
    private String type;

    private GetNodeConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clusterName = builder.clusterName;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeConfigRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetNodeConfigRequest, Builder> {
        private String instanceId; 
        private String clusterName; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clusterName = request.clusterName;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * ### Sample responses
         * <p>
         * 
         * Success responses ﻿
         * 
         * ```java
         * {
         * ﻿
         *   "requestId": "0A6EB64B-B4C8-CF02-810F-E660812972FF",
         * ﻿
         *   "result": {
         * ﻿
         *     "dataFragmentNumber":1,
         * ﻿
         *     "dataDuplicateNumber":1,
         * ﻿
         *     "minServicePercent":20,
         * ﻿
         *     "published":true,
         * ﻿
         *     "active": true  // Indicates whether the online configurations have taken effect.
         * ﻿
         *   }
         * ﻿
         * }
         * ```
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetNodeConfigRequest build() {
            return new GetNodeConfigRequest(this);
        } 

    } 

}
