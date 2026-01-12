// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link UpdateLocationServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateLocationServiceRequest</p>
 */
public class UpdateLocationServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Qps")
    private Integer qps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SvcName")
    private String svcName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SvcState")
    private String svcState;

    private UpdateLocationServiceRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jwtToken = builder.jwtToken;
        this.note = builder.note;
        this.qps = builder.qps;
        this.svcName = builder.svcName;
        this.svcState = builder.svcState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLocationServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return qps
     */
    public Integer getQps() {
        return this.qps;
    }

    /**
     * @return svcName
     */
    public String getSvcName() {
        return this.svcName;
    }

    /**
     * @return svcState
     */
    public String getSvcState() {
        return this.svcState;
    }

    public static final class Builder extends Request.Builder<UpdateLocationServiceRequest, Builder> {
        private Long id; 
        private String jwtToken; 
        private String note; 
        private Integer qps; 
        private String svcName; 
        private String svcState; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLocationServiceRequest request) {
            super(request);
            this.id = request.id;
            this.jwtToken = request.jwtToken;
            this.note = request.note;
            this.qps = request.qps;
            this.svcName = request.svcName;
            this.svcState = request.svcState;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putBodyParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * Qps.
         */
        public Builder qps(Integer qps) {
            this.putBodyParameter("Qps", qps);
            this.qps = qps;
            return this;
        }

        /**
         * SvcName.
         */
        public Builder svcName(String svcName) {
            this.putBodyParameter("SvcName", svcName);
            this.svcName = svcName;
            return this;
        }

        /**
         * SvcState.
         */
        public Builder svcState(String svcState) {
            this.putBodyParameter("SvcState", svcState);
            this.svcState = svcState;
            return this;
        }

        @Override
        public UpdateLocationServiceRequest build() {
            return new UpdateLocationServiceRequest(this);
        } 

    } 

}
