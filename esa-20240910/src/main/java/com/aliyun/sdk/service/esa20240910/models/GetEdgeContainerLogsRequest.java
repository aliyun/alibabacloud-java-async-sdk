// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerLogsRequest} extends {@link RequestModel}
 *
 * <p>GetEdgeContainerLogsRequest</p>
 */
public class GetEdgeContainerLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lines")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer lines;

    private GetEdgeContainerLogsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.lines = builder.lines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return lines
     */
    public Integer getLines() {
        return this.lines;
    }

    public static final class Builder extends Request.Builder<GetEdgeContainerLogsRequest, Builder> {
        private String appId; 
        private Integer lines; 

        private Builder() {
            super();
        } 

        private Builder(GetEdgeContainerLogsRequest request) {
            super(request);
            this.appId = request.appId;
            this.lines = request.lines;
        } 

        /**
         * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The number of log entries to output.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder lines(Integer lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        @Override
        public GetEdgeContainerLogsRequest build() {
            return new GetEdgeContainerLogsRequest(this);
        } 

    } 

}
