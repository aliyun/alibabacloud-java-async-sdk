// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecordsRequest} extends {@link RequestModel}
 *
 * <p>DeleteRecordsRequest</p>
 */
public class DeleteRecordsRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    private String algorithmType;

    @Body
    @NameInMap("AttributeName")
    private String attributeName;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("OperatorType")
    private String operatorType;

    @Body
    @NameInMap("Value")
    private String value;

    private DeleteRecordsRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.attributeName = builder.attributeName;
        this.corpId = builder.corpId;
        this.operatorType = builder.operatorType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return attributeName
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DeleteRecordsRequest, Builder> {
        private String algorithmType; 
        private String attributeName; 
        private String corpId; 
        private String operatorType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRecordsRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.attributeName = response.attributeName;
            this.corpId = response.corpId;
            this.operatorType = response.operatorType;
            this.value = response.value;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * AttributeName.
         */
        public Builder attributeName(String attributeName) {
            this.putBodyParameter("AttributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * OperatorType.
         */
        public Builder operatorType(String operatorType) {
            this.putBodyParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DeleteRecordsRequest build() {
            return new DeleteRecordsRequest(this);
        } 

    } 

}
