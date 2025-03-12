// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ListFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>ListFCTriggerRequest</p>
 */
public class ListFCTriggerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventMetaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventMetaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventMetaVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventMetaVersion;

    private ListFCTriggerRequest(Builder builder) {
        super(builder);
        this.eventMetaName = builder.eventMetaName;
        this.eventMetaVersion = builder.eventMetaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFCTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventMetaName
     */
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    /**
     * @return eventMetaVersion
     */
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    public static final class Builder extends Request.Builder<ListFCTriggerRequest, Builder> {
        private String eventMetaName; 
        private String eventMetaVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListFCTriggerRequest request) {
            super(request);
            this.eventMetaName = request.eventMetaName;
            this.eventMetaVersion = request.eventMetaVersion;
        } 

        /**
         * <p>The name of the event. You can specify only one name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LogFileCreated</p>
         */
        public Builder eventMetaName(String eventMetaName) {
            this.putQueryParameter("EventMetaName", eventMetaName);
            this.eventMetaName = eventMetaName;
            return this;
        }

        /**
         * <p>The version number of the event. You can specify only one version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder eventMetaVersion(String eventMetaVersion) {
            this.putQueryParameter("EventMetaVersion", eventMetaVersion);
            this.eventMetaVersion = eventMetaVersion;
            return this;
        }

        @Override
        public ListFCTriggerRequest build() {
            return new ListFCTriggerRequest(this);
        } 

    } 

}
