// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AddDataAgentMemoryRequest} extends {@link RequestModel}
 *
 * <p>AddDataAgentMemoryRequest</p>
 */
public class AddDataAgentMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromId")
    private String fromId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemFrom")
    private String memFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionUuid")
    private String sessionUuid;

    private AddDataAgentMemoryRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.DMSUnit = builder.DMSUnit;
        this.fromId = builder.fromId;
        this.label = builder.label;
        this.memFrom = builder.memFrom;
        this.sessionUuid = builder.sessionUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataAgentMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return fromId
     */
    public String getFromId() {
        return this.fromId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return memFrom
     */
    public String getMemFrom() {
        return this.memFrom;
    }

    /**
     * @return sessionUuid
     */
    public String getSessionUuid() {
        return this.sessionUuid;
    }

    public static final class Builder extends Request.Builder<AddDataAgentMemoryRequest, Builder> {
        private String content; 
        private String DMSUnit; 
        private String fromId; 
        private String label; 
        private String memFrom; 
        private String sessionUuid; 

        private Builder() {
            super();
        } 

        private Builder(AddDataAgentMemoryRequest request) {
            super(request);
            this.content = request.content;
            this.DMSUnit = request.DMSUnit;
            this.fromId = request.fromId;
            this.label = request.label;
            this.memFrom = request.memFrom;
            this.sessionUuid = request.sessionUuid;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * FromId.
         */
        public Builder fromId(String fromId) {
            this.putQueryParameter("FromId", fromId);
            this.fromId = fromId;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * MemFrom.
         */
        public Builder memFrom(String memFrom) {
            this.putQueryParameter("MemFrom", memFrom);
            this.memFrom = memFrom;
            return this;
        }

        /**
         * SessionUuid.
         */
        public Builder sessionUuid(String sessionUuid) {
            this.putQueryParameter("SessionUuid", sessionUuid);
            this.sessionUuid = sessionUuid;
            return this;
        }

        @Override
        public AddDataAgentMemoryRequest build() {
            return new AddDataAgentMemoryRequest(this);
        } 

    } 

}
