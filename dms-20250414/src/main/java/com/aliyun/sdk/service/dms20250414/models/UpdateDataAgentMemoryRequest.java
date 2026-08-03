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
 * {@link UpdateDataAgentMemoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataAgentMemoryRequest</p>
 */
public class UpdateDataAgentMemoryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MemFrom")
    private String memFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UpdateDataAgentMemoryRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.DMSUnit = builder.DMSUnit;
        this.fromId = builder.fromId;
        this.memFrom = builder.memFrom;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentMemoryRequest create() {
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
     * @return memFrom
     */
    public String getMemFrom() {
        return this.memFrom;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<UpdateDataAgentMemoryRequest, Builder> {
        private String content; 
        private String DMSUnit; 
        private String fromId; 
        private String memFrom; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAgentMemoryRequest request) {
            super(request);
            this.content = request.content;
            this.DMSUnit = request.DMSUnit;
            this.fromId = request.fromId;
            this.memFrom = request.memFrom;
            this.uuid = request.uuid;
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
         * MemFrom.
         */
        public Builder memFrom(String memFrom) {
            this.putQueryParameter("MemFrom", memFrom);
            this.memFrom = memFrom;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public UpdateDataAgentMemoryRequest build() {
            return new UpdateDataAgentMemoryRequest(this);
        } 

    } 

}
