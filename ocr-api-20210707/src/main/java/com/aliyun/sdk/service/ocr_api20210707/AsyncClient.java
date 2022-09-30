// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ocr_api20210707.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<RecognizeAdvancedResponse> recognizeAdvanced(RecognizeAdvancedRequest request);

    CompletableFuture<RecognizeAirItineraryResponse> recognizeAirItinerary(RecognizeAirItineraryRequest request);

    CompletableFuture<RecognizeBankAcceptanceResponse> recognizeBankAcceptance(RecognizeBankAcceptanceRequest request);

    CompletableFuture<RecognizeBankAccountLicenseResponse> recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request);

    CompletableFuture<RecognizeBankCardResponse> recognizeBankCard(RecognizeBankCardRequest request);

    CompletableFuture<RecognizeBasicResponse> recognizeBasic(RecognizeBasicRequest request);

    CompletableFuture<RecognizeBirthCertificationResponse> recognizeBirthCertification(RecognizeBirthCertificationRequest request);

    CompletableFuture<RecognizeBusShipTicketResponse> recognizeBusShipTicket(RecognizeBusShipTicketRequest request);

    CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicense(RecognizeBusinessLicenseRequest request);

    CompletableFuture<RecognizeCarInvoiceResponse> recognizeCarInvoice(RecognizeCarInvoiceRequest request);

    CompletableFuture<RecognizeCarNumberResponse> recognizeCarNumber(RecognizeCarNumberRequest request);

    CompletableFuture<RecognizeCarVinCodeResponse> recognizeCarVinCode(RecognizeCarVinCodeRequest request);

    CompletableFuture<RecognizeChinesePassportResponse> recognizeChinesePassport(RecognizeChinesePassportRequest request);

    CompletableFuture<RecognizeCommonPrintedInvoiceResponse> recognizeCommonPrintedInvoice(RecognizeCommonPrintedInvoiceRequest request);

    CompletableFuture<RecognizeCosmeticProduceLicenseResponse> recognizeCosmeticProduceLicense(RecognizeCosmeticProduceLicenseRequest request);

    CompletableFuture<RecognizeCovidTestReportResponse> recognizeCovidTestReport(RecognizeCovidTestReportRequest request);

    CompletableFuture<RecognizeCtwoMedicalDeviceManageLicenseResponse> recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request);

    CompletableFuture<RecognizeDocumentStructureResponse> recognizeDocumentStructure(RecognizeDocumentStructureRequest request);

    CompletableFuture<RecognizeDrivingLicenseResponse> recognizeDrivingLicense(RecognizeDrivingLicenseRequest request);

    CompletableFuture<RecognizeEduFormulaResponse> recognizeEduFormula(RecognizeEduFormulaRequest request);

    CompletableFuture<RecognizeEduOralCalculationResponse> recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request);

    CompletableFuture<RecognizeEduPaperCutResponse> recognizeEduPaperCut(RecognizeEduPaperCutRequest request);

    CompletableFuture<RecognizeEduPaperOcrResponse> recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request);

    CompletableFuture<RecognizeEduPaperStructedResponse> recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request);

    CompletableFuture<RecognizeEduQuestionOcrResponse> recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request);

    CompletableFuture<RecognizeEnglishResponse> recognizeEnglish(RecognizeEnglishRequest request);

    CompletableFuture<RecognizeEstateCertificationResponse> recognizeEstateCertification(RecognizeEstateCertificationRequest request);

    CompletableFuture<RecognizeExitEntryPermitToHKResponse> recognizeExitEntryPermitToHK(RecognizeExitEntryPermitToHKRequest request);

    CompletableFuture<RecognizeExitEntryPermitToMainlandResponse> recognizeExitEntryPermitToMainland(RecognizeExitEntryPermitToMainlandRequest request);

    CompletableFuture<RecognizeFoodManageLicenseResponse> recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request);

    CompletableFuture<RecognizeFoodProduceLicenseResponse> recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request);

    CompletableFuture<RecognizeGeneralResponse> recognizeGeneral(RecognizeGeneralRequest request);

    CompletableFuture<RecognizeHandwritingResponse> recognizeHandwriting(RecognizeHandwritingRequest request);

    CompletableFuture<RecognizeHealthCodeResponse> recognizeHealthCode(RecognizeHealthCodeRequest request);

    CompletableFuture<RecognizeHotelConsumeResponse> recognizeHotelConsume(RecognizeHotelConsumeRequest request);

    CompletableFuture<RecognizeHouseholdResponse> recognizeHousehold(RecognizeHouseholdRequest request);

    CompletableFuture<RecognizeIdcardResponse> recognizeIdcard(RecognizeIdcardRequest request);

    CompletableFuture<RecognizeInternationalIdcardResponse> recognizeInternationalIdcard(RecognizeInternationalIdcardRequest request);

    CompletableFuture<RecognizeInvoiceResponse> recognizeInvoice(RecognizeInvoiceRequest request);

    CompletableFuture<RecognizeJanpaneseResponse> recognizeJanpanese(RecognizeJanpaneseRequest request);

    CompletableFuture<RecognizeKoreanResponse> recognizeKorean(RecognizeKoreanRequest request);

    CompletableFuture<RecognizeLatinResponse> recognizeLatin(RecognizeLatinRequest request);

    CompletableFuture<RecognizeMedicalDeviceManageLicenseResponse> recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request);

    CompletableFuture<RecognizeMedicalDeviceProduceLicenseResponse> recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request);

    CompletableFuture<RecognizeMixedInvoicesResponse> recognizeMixedInvoices(RecognizeMixedInvoicesRequest request);

    CompletableFuture<RecognizeMultiLanguageResponse> recognizeMultiLanguage(RecognizeMultiLanguageRequest request);

    CompletableFuture<RecognizeNonTaxInvoiceResponse> recognizeNonTaxInvoice(RecognizeNonTaxInvoiceRequest request);

    CompletableFuture<RecognizePassportResponse> recognizePassport(RecognizePassportRequest request);

    CompletableFuture<RecognizePaymentRecordResponse> recognizePaymentRecord(RecognizePaymentRecordRequest request);

    CompletableFuture<RecognizePurchaseRecordResponse> recognizePurchaseRecord(RecognizePurchaseRecordRequest request);

    CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request);

    CompletableFuture<RecognizeRideHailingItineraryResponse> recognizeRideHailingItinerary(RecognizeRideHailingItineraryRequest request);

    CompletableFuture<RecognizeRollTicketResponse> recognizeRollTicket(RecognizeRollTicketRequest request);

    CompletableFuture<RecognizeRussianResponse> recognizeRussian(RecognizeRussianRequest request);

    CompletableFuture<RecognizeShoppingReceiptResponse> recognizeShoppingReceipt(RecognizeShoppingReceiptRequest request);

    CompletableFuture<RecognizeSocialSecurityCardResponse> recognizeSocialSecurityCard(RecognizeSocialSecurityCardRequest request);

    CompletableFuture<RecognizeSocialSecurityCardVersionIIResponse> recognizeSocialSecurityCardVersionII(RecognizeSocialSecurityCardVersionIIRequest request);

    CompletableFuture<RecognizeTableOcrResponse> recognizeTableOcr(RecognizeTableOcrRequest request);

    CompletableFuture<RecognizeTaxClearanceCertificateResponse> recognizeTaxClearanceCertificate(RecognizeTaxClearanceCertificateRequest request);

    CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request);

    CompletableFuture<RecognizeThaiResponse> recognizeThai(RecognizeThaiRequest request);

    CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoice(RecognizeTollInvoiceRequest request);

    CompletableFuture<RecognizeTradeMarkCertificationResponse> recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request);

    CompletableFuture<RecognizeTrainInvoiceResponse> recognizeTrainInvoice(RecognizeTrainInvoiceRequest request);

    CompletableFuture<RecognizeTravelCardResponse> recognizeTravelCard(RecognizeTravelCardRequest request);

    CompletableFuture<RecognizeUsedCarInvoiceResponse> recognizeUsedCarInvoice(RecognizeUsedCarInvoiceRequest request);

    CompletableFuture<RecognizeVehicleCertificationResponse> recognizeVehicleCertification(RecognizeVehicleCertificationRequest request);

    CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicense(RecognizeVehicleLicenseRequest request);

    CompletableFuture<RecognizeVehicleRegistrationResponse> recognizeVehicleRegistration(RecognizeVehicleRegistrationRequest request);

    CompletableFuture<RecognizeWaybillResponse> recognizeWaybill(RecognizeWaybillRequest request);

}
