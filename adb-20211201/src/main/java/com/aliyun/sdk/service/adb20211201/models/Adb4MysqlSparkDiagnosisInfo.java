// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Adb4MysqlSparkDiagnosisInfo} extends {@link TeaModel}
 *
 * <p>Adb4MysqlSparkDiagnosisInfo</p>
 */
public class Adb4MysqlSparkDiagnosisInfo extends TeaModel {
    @NameInMap("DiagnosisCode")
    private String diagnosisCode;

    @NameInMap("DiagnosisCodeLabel")
    private String diagnosisCodeLabel;

    @NameInMap("DiagnosisMsg")
    private String diagnosisMsg;

    @NameInMap("DiagnosisType")
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
