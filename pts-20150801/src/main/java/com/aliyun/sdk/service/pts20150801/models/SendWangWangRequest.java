// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendWangWangRequest} extends {@link RequestModel}
 *
 * <p>SendWangWangRequest</p>
 */
public class SendWangWangRequest extends Request {
    @Query
    @NameInMap("Msg")
    @Validation(required = true)
    private String msg;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private java.util.Map < String, ? > to;

    private SendWangWangRequest(Builder builder) {
        super(builder);
        this.msg = builder.msg;
        this.title = builder.title;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendWangWangRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return to
     */
    public java.util.Map < String, ? > getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<SendWangWangRequest, Builder> {
        private String msg; 
        private String title; 
        private java.util.Map < String, ? > to; 

        private Builder() {
            super();
        } 

        private Builder(SendWangWangRequest request) {
            super(request);
            this.msg = request.msg;
            this.title = request.title;
            this.to = request.to;
        } 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.putQueryParameter("Msg", msg);
            this.msg = msg;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * To.
         */
        public Builder to(java.util.Map < String, ? > to) {
            String toShrink = shrink(to, "To", "json");
            this.putQueryParameter("To", toShrink);
            this.to = to;
            return this;
        }

        @Override
        public SendWangWangRequest build() {
            return new SendWangWangRequest(this);
        } 

    } 

}
