// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link GetSubTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetSubTaskResultRequest</p>
 */
public class GetSubTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTaskId")
    private Integer subTaskId;

    private GetSubTaskResultRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.subTaskId = builder.subTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubTaskResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return subTaskId
     */
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

    public static final class Builder extends Request.Builder<GetSubTaskResultRequest, Builder> {
        private String lang; 
        private String regId; 
        private Integer subTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubTaskResultRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.subTaskId = request.subTaskId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SubTaskId.
         */
        public Builder subTaskId(Integer subTaskId) {
            this.putQueryParameter("SubTaskId", subTaskId);
            this.subTaskId = subTaskId;
            return this;
        }

        @Override
        public GetSubTaskResultRequest build() {
            return new GetSubTaskResultRequest(this);
        } 

    } 

}
