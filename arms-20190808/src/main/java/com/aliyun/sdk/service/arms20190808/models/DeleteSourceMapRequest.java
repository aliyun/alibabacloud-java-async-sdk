// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSourceMapRequest} extends {@link RequestModel}
 *
 * <p>DeleteSourceMapRequest</p>
 */
public class DeleteSourceMapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > fidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteSourceMapRequest(Builder builder) {
        super(builder);
        this.fidList = builder.fidList;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSourceMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fidList
     */
    public java.util.List < String > getFidList() {
        return this.fidList;
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

    public static final class Builder extends Request.Builder<DeleteSourceMapRequest, Builder> {
        private java.util.List < String > fidList; 
        private String pid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSourceMapRequest request) {
            super(request);
            this.fidList = request.fidList;
            this.pid = request.pid;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the SourceMap file.
         */
        public Builder fidList(java.util.List < String > fidList) {
            String fidListShrink = shrink(fidList, "FidList", "json");
            this.putQueryParameter("FidList", fidListShrink);
            this.fidList = fidList;
            return this;
        }

        /**
         * The process ID (PID) of the application.
         * <p>
         * 
         * Log on to the ARMS console. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the **Browser Monitoring** page, click the name of an application. The URL in the browser address bar contains the PID of this application in the format of `pid=xxx`. As the browser is encoded, the PID needs to be modified. Assume that the PID contained is `xxx%4074xxx`. You need to **replace** \*\*%40 with @\*\* and change the PID to `xxx@74xxx`.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteSourceMapRequest build() {
            return new DeleteSourceMapRequest(this);
        } 

    } 

}
