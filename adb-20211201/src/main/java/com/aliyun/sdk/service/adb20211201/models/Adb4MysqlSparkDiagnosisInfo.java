// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link Adb4MysqlSparkDiagnosisInfo} extends {@link TeaModel}
 *
 * <p>Adb4MysqlSparkDiagnosisInfo</p>
 */
public class Adb4MysqlSparkDiagnosisInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosisCode")
    private String diagnosisCode;

    @com.aliyun.core.annotation.NameInMap("DiagnosisCodeLabel")
    private String diagnosisCodeLabel;

    @com.aliyun.core.annotation.NameInMap("DiagnosisMsg")
    private String diagnosisMsg;

    @com.aliyun.core.annotation.NameInMap("DiagnosisType")
    private String diagnosisType;

    private Adb4MysqlSparkDiagnosisInfo(Builder builder) {
        this.diagnosisCode = builder.diagnosisCode;
        this.diagnosisCodeLabel = builder.diagnosisCodeLabel;
        this.diagnosisMsg = builder.diagnosisMsg;
        this.diagnosisType = builder.diagnosisType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Adb4MysqlSparkDiagnosisInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosisCode
     */
    public String getDiagnosisCode() {
        return this.diagnosisCode;
    }

    /**
     * @return diagnosisCodeLabel
     */
    public String getDiagnosisCodeLabel() {
        return this.diagnosisCodeLabel;
    }

    /**
     * @return diagnosisMsg
     */
    public String getDiagnosisMsg() {
        return this.diagnosisMsg;
    }

    /**
     * @return diagnosisType
     */
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public static final class Builder {
        private String diagnosisCode; 
        private String diagnosisCodeLabel; 
        private String diagnosisMsg; 
        private String diagnosisType; 

        private Builder() {
        } 

        private Builder(Adb4MysqlSparkDiagnosisInfo model) {
            this.diagnosisCode = model.diagnosisCode;
            this.diagnosisCodeLabel = model.diagnosisCodeLabel;
            this.diagnosisMsg = model.diagnosisMsg;
            this.diagnosisType = model.diagnosisType;
        } 

        /**
         * DiagnosisCode.
         */
        public Builder diagnosisCode(String diagnosisCode) {
            this.diagnosisCode = diagnosisCode;
            return this;
        }

        /**
         * DiagnosisCodeLabel.
         */
        public Builder diagnosisCodeLabel(String diagnosisCodeLabel) {
            this.diagnosisCodeLabel = diagnosisCodeLabel;
            return this;
        }

        /**
         * DiagnosisMsg.
         */
        public Builder diagnosisMsg(String diagnosisMsg) {
            this.diagnosisMsg = diagnosisMsg;
            return this;
        }

        /**
         * DiagnosisType.
         */
        public Builder diagnosisType(String diagnosisType) {
            this.diagnosisType = diagnosisType;
            return this;
        }

        public Adb4MysqlSparkDiagnosisInfo build() {
            return new Adb4MysqlSparkDiagnosisInfo(this);
        } 

    } 

}
