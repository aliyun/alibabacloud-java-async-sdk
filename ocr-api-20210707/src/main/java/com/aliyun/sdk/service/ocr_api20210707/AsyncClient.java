// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ocr_api20210707.models.*;
import com.aliyun.sdk.gateway.pop.Configuration;
import com.aliyun.sdk.gateway.pop.auth.SignatureVersion;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder().serviceConfiguration(Configuration.create().setSignatureVersion(SignatureVersion.V3));
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of RecognizeAdvanced  RecognizeAdvancedRequest
     * @return RecognizeAdvancedResponse
     */
    CompletableFuture<RecognizeAdvancedResponse> recognizeAdvanced(RecognizeAdvancedRequest request);

    /**
     * @param request the request parameters of RecognizeAirItinerary  RecognizeAirItineraryRequest
     * @return RecognizeAirItineraryResponse
     */
    CompletableFuture<RecognizeAirItineraryResponse> recognizeAirItinerary(RecognizeAirItineraryRequest request);

    /**
     * @param request the request parameters of RecognizeAllText  RecognizeAllTextRequest
     * @return RecognizeAllTextResponse
     */
    CompletableFuture<RecognizeAllTextResponse> recognizeAllText(RecognizeAllTextRequest request);

    /**
     * @param request the request parameters of RecognizeBankAcceptance  RecognizeBankAcceptanceRequest
     * @return RecognizeBankAcceptanceResponse
     */
    CompletableFuture<RecognizeBankAcceptanceResponse> recognizeBankAcceptance(RecognizeBankAcceptanceRequest request);

    /**
     * @param request the request parameters of RecognizeBankAccountLicense  RecognizeBankAccountLicenseRequest
     * @return RecognizeBankAccountLicenseResponse
     */
    CompletableFuture<RecognizeBankAccountLicenseResponse> recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeBankCard  RecognizeBankCardRequest
     * @return RecognizeBankCardResponse
     */
    CompletableFuture<RecognizeBankCardResponse> recognizeBankCard(RecognizeBankCardRequest request);

    /**
     * @param request the request parameters of RecognizeBasic  RecognizeBasicRequest
     * @return RecognizeBasicResponse
     */
    CompletableFuture<RecognizeBasicResponse> recognizeBasic(RecognizeBasicRequest request);

    /**
     * @param request the request parameters of RecognizeBirthCertification  RecognizeBirthCertificationRequest
     * @return RecognizeBirthCertificationResponse
     */
    CompletableFuture<RecognizeBirthCertificationResponse> recognizeBirthCertification(RecognizeBirthCertificationRequest request);

    /**
     * @param request the request parameters of RecognizeBusShipTicket  RecognizeBusShipTicketRequest
     * @return RecognizeBusShipTicketResponse
     */
    CompletableFuture<RecognizeBusShipTicketResponse> recognizeBusShipTicket(RecognizeBusShipTicketRequest request);

    /**
     * @param request the request parameters of RecognizeBusinessLicense  RecognizeBusinessLicenseRequest
     * @return RecognizeBusinessLicenseResponse
     */
    CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicense(RecognizeBusinessLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeCarInvoice  RecognizeCarInvoiceRequest
     * @return RecognizeCarInvoiceResponse
     */
    CompletableFuture<RecognizeCarInvoiceResponse> recognizeCarInvoice(RecognizeCarInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeCarNumber  RecognizeCarNumberRequest
     * @return RecognizeCarNumberResponse
     */
    CompletableFuture<RecognizeCarNumberResponse> recognizeCarNumber(RecognizeCarNumberRequest request);

    /**
     * @param request the request parameters of RecognizeCarVinCode  RecognizeCarVinCodeRequest
     * @return RecognizeCarVinCodeResponse
     */
    CompletableFuture<RecognizeCarVinCodeResponse> recognizeCarVinCode(RecognizeCarVinCodeRequest request);

    /**
     * @param request the request parameters of RecognizeChinesePassport  RecognizeChinesePassportRequest
     * @return RecognizeChinesePassportResponse
     */
    CompletableFuture<RecognizeChinesePassportResponse> recognizeChinesePassport(RecognizeChinesePassportRequest request);

    /**
     * @param request the request parameters of RecognizeCommonPrintedInvoice  RecognizeCommonPrintedInvoiceRequest
     * @return RecognizeCommonPrintedInvoiceResponse
     */
    CompletableFuture<RecognizeCommonPrintedInvoiceResponse> recognizeCommonPrintedInvoice(RecognizeCommonPrintedInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeCosmeticProduceLicense  RecognizeCosmeticProduceLicenseRequest
     * @return RecognizeCosmeticProduceLicenseResponse
     */
    CompletableFuture<RecognizeCosmeticProduceLicenseResponse> recognizeCosmeticProduceLicense(RecognizeCosmeticProduceLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeCovidTestReport  RecognizeCovidTestReportRequest
     * @return RecognizeCovidTestReportResponse
     */
    CompletableFuture<RecognizeCovidTestReportResponse> recognizeCovidTestReport(RecognizeCovidTestReportRequest request);

    /**
     * @param request the request parameters of RecognizeCtwoMedicalDeviceManageLicense  RecognizeCtwoMedicalDeviceManageLicenseRequest
     * @return RecognizeCtwoMedicalDeviceManageLicenseResponse
     */
    CompletableFuture<RecognizeCtwoMedicalDeviceManageLicenseResponse> recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeDocumentStructure  RecognizeDocumentStructureRequest
     * @return RecognizeDocumentStructureResponse
     */
    CompletableFuture<RecognizeDocumentStructureResponse> recognizeDocumentStructure(RecognizeDocumentStructureRequest request);

    /**
     * @param request the request parameters of RecognizeDrivingLicense  RecognizeDrivingLicenseRequest
     * @return RecognizeDrivingLicenseResponse
     */
    CompletableFuture<RecognizeDrivingLicenseResponse> recognizeDrivingLicense(RecognizeDrivingLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeEduFormula  RecognizeEduFormulaRequest
     * @return RecognizeEduFormulaResponse
     */
    CompletableFuture<RecognizeEduFormulaResponse> recognizeEduFormula(RecognizeEduFormulaRequest request);

    /**
     * @param request the request parameters of RecognizeEduOralCalculation  RecognizeEduOralCalculationRequest
     * @return RecognizeEduOralCalculationResponse
     */
    CompletableFuture<RecognizeEduOralCalculationResponse> recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request);

    /**
     * @param request the request parameters of RecognizeEduPaperCut  RecognizeEduPaperCutRequest
     * @return RecognizeEduPaperCutResponse
     */
    CompletableFuture<RecognizeEduPaperCutResponse> recognizeEduPaperCut(RecognizeEduPaperCutRequest request);

    /**
     * @param request the request parameters of RecognizeEduPaperOcr  RecognizeEduPaperOcrRequest
     * @return RecognizeEduPaperOcrResponse
     */
    CompletableFuture<RecognizeEduPaperOcrResponse> recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request);

    /**
     * @param request the request parameters of RecognizeEduPaperStructed  RecognizeEduPaperStructedRequest
     * @return RecognizeEduPaperStructedResponse
     */
    CompletableFuture<RecognizeEduPaperStructedResponse> recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request);

    /**
     * @param request the request parameters of RecognizeEduQuestionOcr  RecognizeEduQuestionOcrRequest
     * @return RecognizeEduQuestionOcrResponse
     */
    CompletableFuture<RecognizeEduQuestionOcrResponse> recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request);

    /**
     * @param request the request parameters of RecognizeEnglish  RecognizeEnglishRequest
     * @return RecognizeEnglishResponse
     */
    CompletableFuture<RecognizeEnglishResponse> recognizeEnglish(RecognizeEnglishRequest request);

    /**
     * @param request the request parameters of RecognizeEstateCertification  RecognizeEstateCertificationRequest
     * @return RecognizeEstateCertificationResponse
     */
    CompletableFuture<RecognizeEstateCertificationResponse> recognizeEstateCertification(RecognizeEstateCertificationRequest request);

    /**
     * @param request the request parameters of RecognizeExitEntryPermitToHK  RecognizeExitEntryPermitToHKRequest
     * @return RecognizeExitEntryPermitToHKResponse
     */
    CompletableFuture<RecognizeExitEntryPermitToHKResponse> recognizeExitEntryPermitToHK(RecognizeExitEntryPermitToHKRequest request);

    /**
     * @param request the request parameters of RecognizeExitEntryPermitToMainland  RecognizeExitEntryPermitToMainlandRequest
     * @return RecognizeExitEntryPermitToMainlandResponse
     */
    CompletableFuture<RecognizeExitEntryPermitToMainlandResponse> recognizeExitEntryPermitToMainland(RecognizeExitEntryPermitToMainlandRequest request);

    /**
     * @param request the request parameters of RecognizeFoodManageLicense  RecognizeFoodManageLicenseRequest
     * @return RecognizeFoodManageLicenseResponse
     */
    CompletableFuture<RecognizeFoodManageLicenseResponse> recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeFoodProduceLicense  RecognizeFoodProduceLicenseRequest
     * @return RecognizeFoodProduceLicenseResponse
     */
    CompletableFuture<RecognizeFoodProduceLicenseResponse> recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeGeneral  RecognizeGeneralRequest
     * @return RecognizeGeneralResponse
     */
    CompletableFuture<RecognizeGeneralResponse> recognizeGeneral(RecognizeGeneralRequest request);

    /**
     * @param request the request parameters of RecognizeGeneralStructure  RecognizeGeneralStructureRequest
     * @return RecognizeGeneralStructureResponse
     */
    CompletableFuture<RecognizeGeneralStructureResponse> recognizeGeneralStructure(RecognizeGeneralStructureRequest request);

    /**
     * @param request the request parameters of RecognizeHKIdcard  RecognizeHKIdcardRequest
     * @return RecognizeHKIdcardResponse
     */
    CompletableFuture<RecognizeHKIdcardResponse> recognizeHKIdcard(RecognizeHKIdcardRequest request);

    /**
     * @param request the request parameters of RecognizeHandwriting  RecognizeHandwritingRequest
     * @return RecognizeHandwritingResponse
     */
    CompletableFuture<RecognizeHandwritingResponse> recognizeHandwriting(RecognizeHandwritingRequest request);

    /**
     * @param request the request parameters of RecognizeHealthCode  RecognizeHealthCodeRequest
     * @return RecognizeHealthCodeResponse
     */
    CompletableFuture<RecognizeHealthCodeResponse> recognizeHealthCode(RecognizeHealthCodeRequest request);

    /**
     * @param request the request parameters of RecognizeHotelConsume  RecognizeHotelConsumeRequest
     * @return RecognizeHotelConsumeResponse
     */
    CompletableFuture<RecognizeHotelConsumeResponse> recognizeHotelConsume(RecognizeHotelConsumeRequest request);

    /**
     * @param request the request parameters of RecognizeHousehold  RecognizeHouseholdRequest
     * @return RecognizeHouseholdResponse
     */
    CompletableFuture<RecognizeHouseholdResponse> recognizeHousehold(RecognizeHouseholdRequest request);

    /**
     * @param request the request parameters of RecognizeIdcard  RecognizeIdcardRequest
     * @return RecognizeIdcardResponse
     */
    CompletableFuture<RecognizeIdcardResponse> recognizeIdcard(RecognizeIdcardRequest request);

    /**
     * @param request the request parameters of RecognizeInternationalBusinessLicense  RecognizeInternationalBusinessLicenseRequest
     * @return RecognizeInternationalBusinessLicenseResponse
     */
    CompletableFuture<RecognizeInternationalBusinessLicenseResponse> recognizeInternationalBusinessLicense(RecognizeInternationalBusinessLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeInternationalIdcard  RecognizeInternationalIdcardRequest
     * @return RecognizeInternationalIdcardResponse
     */
    CompletableFuture<RecognizeInternationalIdcardResponse> recognizeInternationalIdcard(RecognizeInternationalIdcardRequest request);

    /**
     * @param request the request parameters of RecognizeInvoice  RecognizeInvoiceRequest
     * @return RecognizeInvoiceResponse
     */
    CompletableFuture<RecognizeInvoiceResponse> recognizeInvoice(RecognizeInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeJanpanese  RecognizeJanpaneseRequest
     * @return RecognizeJanpaneseResponse
     */
    CompletableFuture<RecognizeJanpaneseResponse> recognizeJanpanese(RecognizeJanpaneseRequest request);

    /**
     * @param request the request parameters of RecognizeKorean  RecognizeKoreanRequest
     * @return RecognizeKoreanResponse
     */
    CompletableFuture<RecognizeKoreanResponse> recognizeKorean(RecognizeKoreanRequest request);

    /**
     * @param request the request parameters of RecognizeLatin  RecognizeLatinRequest
     * @return RecognizeLatinResponse
     */
    CompletableFuture<RecognizeLatinResponse> recognizeLatin(RecognizeLatinRequest request);

    /**
     * @param request the request parameters of RecognizeMedicalDeviceManageLicense  RecognizeMedicalDeviceManageLicenseRequest
     * @return RecognizeMedicalDeviceManageLicenseResponse
     */
    CompletableFuture<RecognizeMedicalDeviceManageLicenseResponse> recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeMedicalDeviceProduceLicense  RecognizeMedicalDeviceProduceLicenseRequest
     * @return RecognizeMedicalDeviceProduceLicenseResponse
     */
    CompletableFuture<RecognizeMedicalDeviceProduceLicenseResponse> recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeMixedInvoices  RecognizeMixedInvoicesRequest
     * @return RecognizeMixedInvoicesResponse
     */
    CompletableFuture<RecognizeMixedInvoicesResponse> recognizeMixedInvoices(RecognizeMixedInvoicesRequest request);

    /**
     * @param request the request parameters of RecognizeMultiLanguage  RecognizeMultiLanguageRequest
     * @return RecognizeMultiLanguageResponse
     */
    CompletableFuture<RecognizeMultiLanguageResponse> recognizeMultiLanguage(RecognizeMultiLanguageRequest request);

    /**
     * @param request the request parameters of RecognizeNonTaxInvoice  RecognizeNonTaxInvoiceRequest
     * @return RecognizeNonTaxInvoiceResponse
     */
    CompletableFuture<RecognizeNonTaxInvoiceResponse> recognizeNonTaxInvoice(RecognizeNonTaxInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizePassport  RecognizePassportRequest
     * @return RecognizePassportResponse
     */
    CompletableFuture<RecognizePassportResponse> recognizePassport(RecognizePassportRequest request);

    /**
     * @param request the request parameters of RecognizePaymentRecord  RecognizePaymentRecordRequest
     * @return RecognizePaymentRecordResponse
     */
    CompletableFuture<RecognizePaymentRecordResponse> recognizePaymentRecord(RecognizePaymentRecordRequest request);

    /**
     * @param request the request parameters of RecognizePurchaseRecord  RecognizePurchaseRecordRequest
     * @return RecognizePurchaseRecordResponse
     */
    CompletableFuture<RecognizePurchaseRecordResponse> recognizePurchaseRecord(RecognizePurchaseRecordRequest request);

    /**
     * @param request the request parameters of RecognizeQuotaInvoice  RecognizeQuotaInvoiceRequest
     * @return RecognizeQuotaInvoiceResponse
     */
    CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeRideHailingItinerary  RecognizeRideHailingItineraryRequest
     * @return RecognizeRideHailingItineraryResponse
     */
    CompletableFuture<RecognizeRideHailingItineraryResponse> recognizeRideHailingItinerary(RecognizeRideHailingItineraryRequest request);

    /**
     * @param request the request parameters of RecognizeRollTicket  RecognizeRollTicketRequest
     * @return RecognizeRollTicketResponse
     */
    CompletableFuture<RecognizeRollTicketResponse> recognizeRollTicket(RecognizeRollTicketRequest request);

    /**
     * @param request the request parameters of RecognizeRussian  RecognizeRussianRequest
     * @return RecognizeRussianResponse
     */
    CompletableFuture<RecognizeRussianResponse> recognizeRussian(RecognizeRussianRequest request);

    /**
     * @param request the request parameters of RecognizeShoppingReceipt  RecognizeShoppingReceiptRequest
     * @return RecognizeShoppingReceiptResponse
     */
    CompletableFuture<RecognizeShoppingReceiptResponse> recognizeShoppingReceipt(RecognizeShoppingReceiptRequest request);

    /**
     * @param request the request parameters of RecognizeSocialSecurityCard  RecognizeSocialSecurityCardRequest
     * @return RecognizeSocialSecurityCardResponse
     */
    CompletableFuture<RecognizeSocialSecurityCardResponse> recognizeSocialSecurityCard(RecognizeSocialSecurityCardRequest request);

    /**
     * @param request the request parameters of RecognizeSocialSecurityCardVersionII  RecognizeSocialSecurityCardVersionIIRequest
     * @return RecognizeSocialSecurityCardVersionIIResponse
     */
    CompletableFuture<RecognizeSocialSecurityCardVersionIIResponse> recognizeSocialSecurityCardVersionII(RecognizeSocialSecurityCardVersionIIRequest request);

    /**
     * @param request the request parameters of RecognizeTableOcr  RecognizeTableOcrRequest
     * @return RecognizeTableOcrResponse
     */
    CompletableFuture<RecognizeTableOcrResponse> recognizeTableOcr(RecognizeTableOcrRequest request);

    /**
     * @param request the request parameters of RecognizeTaxClearanceCertificate  RecognizeTaxClearanceCertificateRequest
     * @return RecognizeTaxClearanceCertificateResponse
     */
    CompletableFuture<RecognizeTaxClearanceCertificateResponse> recognizeTaxClearanceCertificate(RecognizeTaxClearanceCertificateRequest request);

    /**
     * @param request the request parameters of RecognizeTaxiInvoice  RecognizeTaxiInvoiceRequest
     * @return RecognizeTaxiInvoiceResponse
     */
    CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeThai  RecognizeThaiRequest
     * @return RecognizeThaiResponse
     */
    CompletableFuture<RecognizeThaiResponse> recognizeThai(RecognizeThaiRequest request);

    /**
     * @param request the request parameters of RecognizeTollInvoice  RecognizeTollInvoiceRequest
     * @return RecognizeTollInvoiceResponse
     */
    CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoice(RecognizeTollInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeTradeMarkCertification  RecognizeTradeMarkCertificationRequest
     * @return RecognizeTradeMarkCertificationResponse
     */
    CompletableFuture<RecognizeTradeMarkCertificationResponse> recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request);

    /**
     * @param request the request parameters of RecognizeTrainInvoice  RecognizeTrainInvoiceRequest
     * @return RecognizeTrainInvoiceResponse
     */
    CompletableFuture<RecognizeTrainInvoiceResponse> recognizeTrainInvoice(RecognizeTrainInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeUsedCarInvoice  RecognizeUsedCarInvoiceRequest
     * @return RecognizeUsedCarInvoiceResponse
     */
    CompletableFuture<RecognizeUsedCarInvoiceResponse> recognizeUsedCarInvoice(RecognizeUsedCarInvoiceRequest request);

    /**
     * @param request the request parameters of RecognizeVehicleCertification  RecognizeVehicleCertificationRequest
     * @return RecognizeVehicleCertificationResponse
     */
    CompletableFuture<RecognizeVehicleCertificationResponse> recognizeVehicleCertification(RecognizeVehicleCertificationRequest request);

    /**
     * @param request the request parameters of RecognizeVehicleLicense  RecognizeVehicleLicenseRequest
     * @return RecognizeVehicleLicenseResponse
     */
    CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicense(RecognizeVehicleLicenseRequest request);

    /**
     * @param request the request parameters of RecognizeVehicleRegistration  RecognizeVehicleRegistrationRequest
     * @return RecognizeVehicleRegistrationResponse
     */
    CompletableFuture<RecognizeVehicleRegistrationResponse> recognizeVehicleRegistration(RecognizeVehicleRegistrationRequest request);

    /**
     * @param request the request parameters of RecognizeWaybill  RecognizeWaybillRequest
     * @return RecognizeWaybillResponse
     */
    CompletableFuture<RecognizeWaybillResponse> recognizeWaybill(RecognizeWaybillRequest request);

    /**
     * @param request the request parameters of VerifyBusinessLicense  VerifyBusinessLicenseRequest
     * @return VerifyBusinessLicenseResponse
     */
    CompletableFuture<VerifyBusinessLicenseResponse> verifyBusinessLicense(VerifyBusinessLicenseRequest request);

    /**
     * @param request the request parameters of VerifyVATInvoice  VerifyVATInvoiceRequest
     * @return VerifyVATInvoiceResponse
     */
    CompletableFuture<VerifyVATInvoiceResponse> verifyVATInvoice(VerifyVATInvoiceRequest request);

}
