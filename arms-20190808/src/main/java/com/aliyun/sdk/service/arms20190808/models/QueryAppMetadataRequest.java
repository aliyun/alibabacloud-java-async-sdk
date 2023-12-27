// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppMetadataRequest} extends {@link RequestModel}
 *
 * <p>QueryAppMetadataRequest</p>
 */
public class QueryAppMetadataRequest extends Request {
    @Query
    @NameInMap("MetaIds")
    @Validation(required = true)
    private String metaIds;

    @Query
    @NameInMap("MetaType")
    @Validation(required = true)
    private String metaType;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private QueryAppMetadataRequest(Builder builder) {
        super(builder);
        this.metaIds = builder.metaIds;
        this.metaType = builder.metaType;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaIds
     */
    public String getMetaIds() {
        return this.metaIds;
    }

    /**
     * @return metaType
     */
    public String getMetaType() {
        return this.metaType;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryAppMetadataRequest, Builder> {
        private String metaIds; 
        private String metaType; 
        private String pid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppMetadataRequest request) {
            super(request);
            this.metaIds = request.metaIds;
            this.metaType = request.metaType;
            this.pid = request.pid;
            this.regionId = request.regionId;
        } 

        /**
         * The array of meta Ids.
         */
        public Builder metaIds(String metaIds) {
            this.putQueryParameter("MetaIds", metaIds);
            this.metaIds = metaIds;
            return this;
        }

        /**
         * The mata type.
         */
        public Builder metaType(String metaType) {
            this.putQueryParameter("MetaType", metaType);
            this.metaType = metaType;
            return this;
        }

        /**
         * The ID of the application.
         * <p>
         * 
         * Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryAppMetadataRequest build() {
            return new QueryAppMetadataRequest(this);
        } 

    } 

}
