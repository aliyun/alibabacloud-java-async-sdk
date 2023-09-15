// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelTaskRequest</p>
 */
public class CancelTaskRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TaskNo")
    @Validation(required = true)
    private String taskNo;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private CancelTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskNo = builder.taskNo;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTaskRequest create() {
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
     * @return taskNo
     */
    public String getTaskNo() {
        return this.taskNo;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<CancelTaskRequest, Builder> {
        private String lang; 
        private String taskNo; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(CancelTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskNo = request.taskNo;
            this.userClientIp = request.userClientIp;
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
         * TaskNo.
         */
        public Builder taskNo(String taskNo) {
            this.putQueryParameter("TaskNo", taskNo);
            this.taskNo = taskNo;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public CancelTaskRequest build() {
            return new CancelTaskRequest(this);
        } 

    } 

}
