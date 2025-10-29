// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link PutRecordStorageLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>PutRecordStorageLifeCycleRequest</p>
 */
public class PutRecordStorageLifeCycleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> streamIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnixTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long unixTimestamp;

    private PutRecordStorageLifeCycleRequest(Builder builder) {
        super(builder);
        this.streamIds = builder.streamIds;
        this.tag = builder.tag;
        this.unixTimestamp = builder.unixTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutRecordStorageLifeCycleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return streamIds
     */
    public java.util.List<String> getStreamIds() {
        return this.streamIds;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return unixTimestamp
     */
    public Long getUnixTimestamp() {
        return this.unixTimestamp;
    }

    public static final class Builder extends Request.Builder<PutRecordStorageLifeCycleRequest, Builder> {
        private java.util.List<String> streamIds; 
        private String tag; 
        private Long unixTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(PutRecordStorageLifeCycleRequest request) {
            super(request);
            this.streamIds = request.streamIds;
            this.tag = request.tag;
            this.unixTimestamp = request.unixTimestamp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stream-xxx</p>
         */
        public Builder streamIds(java.util.List<String> streamIds) {
            String streamIdsShrink = shrink(streamIds, "StreamIds", "json");
            this.putBodyParameter("StreamIds", streamIdsShrink);
            this.streamIds = streamIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1095days</p>
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1758621407</p>
         */
        public Builder unixTimestamp(Long unixTimestamp) {
            this.putBodyParameter("UnixTimestamp", unixTimestamp);
            this.unixTimestamp = unixTimestamp;
            return this;
        }

        @Override
        public PutRecordStorageLifeCycleRequest build() {
            return new PutRecordStorageLifeCycleRequest(this);
        } 

    } 

}
