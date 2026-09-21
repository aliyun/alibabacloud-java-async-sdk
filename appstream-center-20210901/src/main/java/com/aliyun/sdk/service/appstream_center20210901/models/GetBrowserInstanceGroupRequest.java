// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetBrowserInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>GetBrowserInstanceGroupRequest</p>
 */
public class GetBrowserInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupId")
    private String browserInstanceGroupId;

    private GetBrowserInstanceGroupRequest(Builder builder) {
        super(builder);
        this.browserInstanceGroupId = builder.browserInstanceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBrowserInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserInstanceGroupId
     */
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public static final class Builder extends Request.Builder<GetBrowserInstanceGroupRequest, Builder> {
        private String browserInstanceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetBrowserInstanceGroupRequest request) {
            super(request);
            this.browserInstanceGroupId = request.browserInstanceGroupId;
        } 

        /**
         * <p>The cloud browser group ID. This parameter is required. Specify the ID of a browser group that is created under the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
         */
        public Builder browserInstanceGroupId(String browserInstanceGroupId) {
            this.putQueryParameter("BrowserInstanceGroupId", browserInstanceGroupId);
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }

        @Override
        public GetBrowserInstanceGroupRequest build() {
            return new GetBrowserInstanceGroupRequest(this);
        } 

    } 

}
