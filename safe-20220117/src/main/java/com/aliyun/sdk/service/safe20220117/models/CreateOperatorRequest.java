// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link CreateOperatorRequest} extends {@link RequestModel}
 *
 * <p>CreateOperatorRequest</p>
 */
public class CreateOperatorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgObject")
    private String bgObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgSystem")
    private String bgSystem;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurEmpId")
    private String curEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoCheck")
    private Boolean noCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoRisk")
    private Boolean noRisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    private CreateOperatorRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.bgObject = builder.bgObject;
        this.bgSystem = builder.bgSystem;
        this.code = builder.code;
        this.curEmpId = builder.curEmpId;
        this.name = builder.name;
        this.noCheck = builder.noCheck;
        this.noRisk = builder.noRisk;
        this.reqTimestamp = builder.reqTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOperatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return bgObject
     */
    public String getBgObject() {
        return this.bgObject;
    }

    /**
     * @return bgSystem
     */
    public String getBgSystem() {
        return this.bgSystem;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return curEmpId
     */
    public String getCurEmpId() {
        return this.curEmpId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return noCheck
     */
    public Boolean getNoCheck() {
        return this.noCheck;
    }

    /**
     * @return noRisk
     */
    public Boolean getNoRisk() {
        return this.noRisk;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public static final class Builder extends Request.Builder<CreateOperatorRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private String bgObject; 
        private String bgSystem; 
        private String code; 
        private String curEmpId; 
        private String name; 
        private Boolean noCheck; 
        private Boolean noRisk; 
        private Long reqTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(CreateOperatorRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.bgObject = request.bgObject;
            this.bgSystem = request.bgSystem;
            this.code = request.code;
            this.curEmpId = request.curEmpId;
            this.name = request.name;
            this.noCheck = request.noCheck;
            this.noRisk = request.noRisk;
            this.reqTimestamp = request.reqTimestamp;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * BgObject.
         */
        public Builder bgObject(String bgObject) {
            this.putBodyParameter("BgObject", bgObject);
            this.bgObject = bgObject;
            return this;
        }

        /**
         * BgSystem.
         */
        public Builder bgSystem(String bgSystem) {
            this.putBodyParameter("BgSystem", bgSystem);
            this.bgSystem = bgSystem;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * CurEmpId.
         */
        public Builder curEmpId(String curEmpId) {
            this.putBodyParameter("CurEmpId", curEmpId);
            this.curEmpId = curEmpId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NoCheck.
         */
        public Builder noCheck(Boolean noCheck) {
            this.putBodyParameter("NoCheck", noCheck);
            this.noCheck = noCheck;
            return this;
        }

        /**
         * NoRisk.
         */
        public Builder noRisk(Boolean noRisk) {
            this.putBodyParameter("NoRisk", noRisk);
            this.noRisk = noRisk;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        @Override
        public CreateOperatorRequest build() {
            return new CreateOperatorRequest(this);
        } 

    } 

}
